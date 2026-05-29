package com.roco.sniffer;

import java.net.Inet4Address;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import com.roco.sniffer.data.ConfigDb;

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
        if (args.length > 0) rmtPort = Integer.parseInt(args[0]);

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
        String iface = autoDetectIface();
        RmtBridge bridge = new RmtBridge(iface, 8195, rmtSender, configDb);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            log.info("正在停止...");
            bridge.stop();
            try { conn.close(); } catch (Exception ignored) {}
            log.info("已停止");
        }));

        bridge.start();
    }

    /**
     * 从当前工作目录加载 game_data.db。
     */
    private static Path resolveDbPath() throws Exception {
        Path dbPath = Paths.get("rmt.db");
        if (Files.isRegularFile(dbPath)) {
            log.info("从外部加载数据库: {}", dbPath.toAbsolutePath());
            return dbPath.toAbsolutePath();
        }
        throw new RuntimeException("rmt.db 不存在，请放在工作目录下: " + Paths.get(".").toAbsolutePath());
    }

    private static String autoDetectIface() {
        try {
            List<PcapNetworkInterface> ifaces = Pcaps.findAllDevs();
            for (PcapNetworkInterface nif : ifaces) {
                for (PcapAddress addr : nif.getAddresses()) {
                    if (addr.getAddress() instanceof Inet4Address ipv4) {
                        String ip = ipv4.getHostAddress();
                        if (!ip.equals("127.0.0.1") && !ip.startsWith("169.254")) {
                            log.info("自动选择网卡: {} (IP: {})", nif.getName(), ip);
                            return nif.getName();
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.warn("网卡检测失败: {}", e.getMessage());
        }
        log.error("未找到可用网卡，请用 --iface 手动指定");
        System.exit(1);
        return null;
    }
}
