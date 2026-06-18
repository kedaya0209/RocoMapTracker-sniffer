package io.github.kedaya0209.roco.sniffer;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import io.github.kedaya0209.roco.sniffer.data.ConfigDb;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.pcap4j.core.PcapAddress;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;

/**
 * RMT 桥接器入口（实时抓包）。
 */
@Slf4j
public class Main {

    public static void main(String[] args) throws Exception {
        int rmtPort = 56796;
        String ifaceOverride = null;
        for (int i = 0; i < args.length; i++) {
            if ("--iface".equals(args[i]) && i + 1 < args.length) {
                ifaceOverride = args[++i];
            } else {
                rmtPort = Integer.parseInt(args[i]);
            }
        }

        // 优先从可执行文件同目录加载 DB（native image），回退到 classpath 提取（fat jar）
        Path dbPath = resolveDbPath();
        Connection conn = DriverManager.getConnection(
                "jdbc:sqlite:file:" + dbPath + "?mode=ro&immutable=1");
        conn.createStatement().executeUpdate("PRAGMA mmap_size = 1073741824"); // 1GB，SQLite 自动 clamp 到文件大小

        // 加载配置
        ConfigDb configDb = ConfigDb.loadAll(conn);

        // 连接 RMT
        RmtSender rmtSender = new RmtSender("127.0.0.1", rmtPort);
        if (!rmtSender.connect()) {
            log.error("RMT 连接失败，退出");
            return;
        }

        // 启动桥接器
        String iface = ifaceOverride != null ? ifaceOverride : autoDetectIface();
        RmtBridge bridge = new RmtBridge(iface, 8195, rmtSender, configDb);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            log.info("正在停止...");
            bridge.stop();
            rmtSender.close();
            try { conn.close(); } catch (Exception ignored) {}
            log.info("已停止");
        }));

        bridge.start();
    }

    /**
     * 加载 rmt.db — 依次尝试：当前目录 → 可执行文件所在目录。
     */
    private static Path resolveDbPath() throws Exception {
        // 1) 当前工作目录
        Path cwd = Paths.get("rmt.db").toAbsolutePath();
        if (Files.isRegularFile(cwd)) {
            log.info("加载数据库: {}", cwd);
            return cwd;
        }
        // 2) 可执行文件所在目录（native image 下可靠）
        String cmd = ProcessHandle.current().info().command().orElse(null);
        if (cmd != null) {
            Path exeDir = Paths.get(cmd).getParent();
            if (exeDir != null) {
                Path exeDb = exeDir.resolve("rmt.db");
                if (Files.isRegularFile(exeDb)) {
                    log.info("从可执行文件目录加载数据库: {}", exeDb);
                    return exeDb;
                }
            }
        }
        throw new RuntimeException("rmt.db 不存在，请放在工作目录下: "
                + Paths.get(".").toAbsolutePath());
    }

    /**
     * 通过外网连通性检测自动选择网卡。
     * 对每个拥有 IPv4 地址的网卡尝试 TCP 建连外网，第一个成功的即选用。
     */
    private static String autoDetectIface() {
        try {
            List<PcapNetworkInterface> ifaces = Pcaps.findAllDevs();
            log.info("发现 {} 个网卡:", ifaces.size());

            // 收集候选网卡：(名称, IP, 描述)
            record Candidate(String name, String ip, String desc) {}
            List<Candidate> candidates = new ArrayList<>();

            for (PcapNetworkInterface nif : ifaces) {
                StringBuilder addrs = new StringBuilder();
                for (PcapAddress addr : nif.getAddresses()) {
                    if (addr.getAddress() instanceof Inet4Address ipv4) {
                        String ip = ipv4.getHostAddress();
                        if (!addrs.isEmpty()) addrs.append(", ");
                        addrs.append(ip);
                        if (!ip.equals("127.0.0.1") && !ip.startsWith("169.254")) {
                            candidates.add(new Candidate(nif.getName(), ip,
                                    nif.getDescription() != null ? nif.getDescription() : ""));
                        }
                    }
                }
                log.info("  {}  [{}]  IP={}", nif.getName(), nif.getDescription(), addrs);
            }

            log.info("候选网卡 {} 个，开始连通性检测...", candidates.size());
            for (Candidate c : candidates) {
                if (probeConnectivity(c.ip)) {
                    log.info("连通性检测通过，选择网卡: {} (IP: {})", c.name, c.ip);
                    return c.name;
                }
            }
        } catch (Exception e) {
            log.warn("网卡检测失败: {}", e.getMessage());
        }
        log.error("未找到可用网卡，请用 --iface 手动指定");
        System.exit(1);
        return null;
    }

    /**
     * 用指定本地 IP 绑定 Socket 并尝试连接外网，验证该网卡是否可达。
     * 依次尝试多个目标，任一成功即返回 true。
     */
    private static boolean probeConnectivity(String localIp) {
        // 多目标容错：Baidu HTTP、Aliyun DNS、公共 DNS
        String[][] targets = {
                {"www.baidu.com", "80"},
                {"223.5.5.5", "53"},
                {"8.8.8.8", "53"},
        };
        for (String[] target : targets) {
            try (Socket sock = new Socket()) {
                sock.bind(new InetSocketAddress(localIp, 0));
                sock.connect(new InetSocketAddress(target[0], Integer.parseInt(target[1])), 1500);
                log.debug("  {} → {}:{} 连通", localIp, target[0], target[1]);
                return true;
            } catch (Exception ignored) {
            }
        }
        log.debug("  {} 连通性检测失败", localIp);
        return false;
    }
}
