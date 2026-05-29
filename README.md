# RocoMapTracker-sniffer

RocoMapTracker 的 Java 抓包桥接组件，功能等价于 Python 版 `rmt_bridge.py`，使用 pcap4j 直接抓包，无需依赖 RKPP。

监听游戏通信协议，解析场景切换、区域变更、物品拾取、战斗事件等，通过 Socket 推送到 RocoMapTracker 主程序。

## 功能

- 使用 pcap4j 直接抓包，解析 BE21 帧 + AES-128-CBC 解密 + protobuf 解码
- 解析场景切换（0x0133）、区域进入/离开（0x0414）、物品拾取（0x0243）
- 战斗系统完整解析：进入、回合开始、技能声明、演出动作、战斗结算
- 宠物队伍管理：切换主力队伍、登录同步、宠物信息查询
- 物品 ID → 名称自动转换（基于 rmt.db SQLite 数据库）
- 场景坐标 → 地图像素坐标转换
- 跨请求物品拾取合并（150ms 防抖）
- 通过 opcode 预过滤跳过 95% 无关包的解密/解析
- 支持 GraalVM native image 编译为独立可执行文件

## 使用

```bash
java -jar RocoMapTracker-sniffer-1.0-SNAPSHOT.jar <RMT端口>
```

或使用 native image：

```bash
RocoMapTracker-sniffer.exe <RMT端口>
```

`rmt.db` 需放在工作目录（jar）或可执行文件同目录（native image）下。

## 构建

```bash
# 编译打包 fat jar
mvn clean package -q

# 构建 native image（需要 GraalVM JDK 25 + native-image 工具）
mvn native:compile -q
```

## 依赖

- Java 25+（GraalVM JDK 25，native image 构建需要）
- pcap4j — 网络抓包
- Npcap/WinPcap — 底层抓包驱动
- rmt.db — 游戏数据 SQLite（从 Release 下载或通过 `build_db.py` 从 JSON 生成）

## 免责声明

本软件仅供学习和研究使用，禁止用于任何违反游戏用户协议的行为。

使用者需自行承担使用本软件产生的一切后果。开发者不对因使用本软件导致的任何账号封禁、数据丢失或其他损失负责。
