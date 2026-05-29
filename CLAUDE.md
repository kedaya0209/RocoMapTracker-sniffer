# CLAUDE.md

本文件为 Claude Code (claude.ai/code) 在 `RocoMapTracker-sniffer` 模块中工作时提供指引。

## 模块职责

`RocoMapTracker-sniffer` 是洛克王国游戏的 **Java 网络抓包桥接器**，功能等价于 Python 版 `rmt_bridge.py`，但使用 pcap4j 直接抓包（不依赖 RKPP）。

核心流程：pcap4j 抓包 → BE21 帧解析 → AES 解密 → protobuf 解码 → opcode 分发 → 语义提取 → TCP 推送到 RocoMapTracker。

## 常用命令

```bash
# 重建游戏数据 SQLite（修改 JSON 后运行）
cd RocoMapTracker-sniffer && python build_db.py

# 重新生成 POJO record 类（修改 proto 文件后运行）
cd RocoMapTracker-sniffer && python gen_pojo.py

# 编译
mvn clean compile

# 打包 fat jar（maven-shade-plugin）
mvn clean package -q

# 运行（rmt.db 放在工作目录下）
java -jar target/RocoMapTracker-sniffer-1.0-SNAPSHOT.jar <RMT端口>

# 跳过测试编译（当前无测试）
mvn clean package -q -DskipTests

# 构建 GraalVM native image（需要 GraalVM JDK + native-image 工具）
mvn native:compile -q
# 输出：target/RocoMapTracker-sniffer.exe（Windows），rmt.db 放在同目录下运行
```

## Native Image 环境要求

- **GraalVM JDK 25**，需设置 `GRAALVM_HOME` 环境变量
- 安装 native-image 工具：`gu install native-image`（GraalVM JDK 17+ 通常已内置）
- Windows 需要 Visual Studio Build Tools（C++ 编译工具链）
- `native:compile` 首次编译较慢（3-5 分钟），后续增量编译更快
- Native image 配置：`src/main/resources/META-INF/native-image/com.roco/RocoMapTracker-sniffer/reachability-metadata.json`
  - 由 `native-image-agent` 自动生成，包含反射/资源/JNI 注册
  - 重新生成：`java -agentlib:native-image-agent=config-output-dir=... -jar target/RocoMapTracker-sniffer-1.0-SNAPSHOT.jar <端口>`

## 架构

### 三级线程管线

```
抓包线程 (pcap4j) → packetPool → 解码线程(×2) → ioPool → IO线程 → RMT TCP
```

- **抓包线程**: `RmtBridge.onPacket()` → TCP 重组 → BE21 帧提取 → 入队 `packetPool`
- **解码线程**: 从 `packetPool` 取帧 → 密钥提取/解密 → opcode 过滤 → 传输层解析 → `ExtractorRegistry.handle()` 分发
- **IO 线程**: 每 50ms 刷出 `ioPool` → `RmtSender.sendBatchRaw()` 批量 TCP 推送

### 提取器模式 (EventExtractor)

所有 opcode 的语义提取通过 `ExtractorRegistry` 分发到独立的 `EventExtractor` 实现：

- `EventExtractor` — 函数式接口，`handle(opcode, payload, ctx)`，声明 `supportedOpcodes()` 自动注册
- `ExtractorContext` — 共享上下文（配置数据库、运行时状态、`enqueue()` 推送到 ioPool）
- `ExtractorRegistry` — opcode → EventExtractor 映射，`createDefault()` 通过 `autoRegister()` 自动注册所有提取器
- `extractors/` 子包 — 提取器实现（一个提取器可处理多个 opcode）

扩展新 opcode 只需：
1. 在 `extractors/` 下实现 `EventExtractor`，覆写 `supportedOpcodes()` 声明支持的 opcode
2. 在 `ExtractorRegistry.createDefault()` 中调用 `registry.autoRegister(new YourExtractor())`

所有提取器通过 `ctx.enqueue(serviceId, payload)` 推送到统一 ioPool，IO 线程统一刷出。Lambda 提取器（不声明 opcode）需手动调用 `registry.register(opcode, lambda)`。

### Opcode → 提取器映射

| Opcode | 提取器 | Proto Class | 方向 |
|--------|--------|------------|------|
| 0x0133 | SceneChangeExtractor | Zonesvr.ZoneSceneMoveReq | c2s |
| 0x0414 | AreaEventExtractor | SpaceAction.ZoneScenePlayActsNotify | s2c |
| 0x0243 | ItemPickupExtractor | ZonesvrNotify.ZoneGoodsRewardNotify | s2c |
| 0x020E | SwitchMainTeamExtractor | Zonesvr.ZonePetChangeMainTeamReq | c2s |
| 0x020F | SwitchMainTeamExtractor | Zonesvr.ZonePetChangeMainTeamRsp | s2c |
| 0x0102 | TeamRosterExtractor | Zonesvr.ZoneLoginRsp | s2c |
| 0x1346 | PetInfoPageExtractor | Zonesvr.ZoneGetPetInfoByPageRsp | s2c |
| 0x01A9 | *(lambda)* | — | s2c |
| 0x130B | SkillSelectExtractor | BattleProto.ZoneBattleCmdPushbackReq | c2s |
| 0x130C | *(lambda)* | — | c2s |
| 0x1312 | *(lambda)* | — | s2c |
| 0x1316 | BattleEnterExtractor | BattleProto.ZoneBattleEnterNotify | s2c |
| 0x131A | RoundStartExtractor | BattleProto.ZoneBattleRoundStartNotify | s2c |
| 0x1322 | SkillDeclareExtractor | BattleProto.ZoneBattleCmdSyncNotify | s2c |
| 0x1324 | PerformActionExtractor | BattleProto.ZoneBattlePerformStartNotify | s2c |
| 0x132C | BattleFinishExtractor | BattleProto.ZoneBattleFinishNotify | s2c |
| 0x13F3 | PerformActionExtractor | BattleProto.ZoneBattlePerformStartNotify | s2c |
| 0x13F4 | PerformActionExtractor | BattleProto.ZoneBattlePerformStartNotify | s2c |
| 0x13FC | PerformActionExtractor | BattleProto.ZoneBattlePerformStartNotify | s2c |

### 关键类职责

| 包 | 类 | 职责 |
|----|----|------|
| root | `Main` | CLI 入口，解析参数，启动 RmtBridge |
| root | `RmtBridge` | 抓包/解密/分发管线，持有 ExtractorRegistry |
| root | `ExtractorRegistry` | opcode → EventExtractor 注册表 |
| root | `ExtractorContext` | 提取器共享上下文（config、状态、enqueue） |
| root | `RmtSender` | 二进制 TCP 消息编码 + 批量发送 |
| codec | `Be21Parser` | BE21 帧解析（魔术字节 `\x33\x66`） |
| codec | `Decryptor` | AES-128-CBC 解密（embedded-IV / fixed-IV） |
| codec | `OpcodeReader` | 从明文中快速提取 opcode |
| codec | `ProtoParser` | protobuf wire-format 通用解析（传输层 5 种布局） |
| capture | `FlowState` | 单条 TCP 流的状态（密钥、方向） |
| capture | `DirectionState` | 单方向的 TCP 重组 |
| data | `ConfigDb` | 游戏数据 SQLite 查询（BagItemDb、AreaFuncDb、NameDb） |

## 依赖

| GroupId:ArtifactId | 版本 | 用途 |
|--------------------|------|------|
| `org.pcap4j:pcap4j-core` | 1.8.2 | 网络抓包 |
| `org.pcap4j:pcap4j-packetfactory-static` | 1.8.2 | pcap 包解析 |
| `net.java.dev.jna:jna` | 5.16.0 | JNA native 调用（覆盖 pcap4j 传递的 5.3.1，支持 GraalVM） |
| `com.luoke:roco-common` | 1.1.1 | JsonUtils (Jackson ObjectMapper 单例) |
| `org.xerial:sqlite-jdbc` | 3.49.1.0 | 嵌入式 SQLite 数据库 |
| `org.slf4j:slf4j-api` | 2.0.16 | 日志门面 |
| `ch.qos.logback:logback-classic` | 1.5.16 | 日志实现 |
| `org.projectlombok:lombok` | 1.18.38 | 编译期注解 (provided) |
| `net.jcip:jcip-annotations` | 1.0 | 线程安全注解 (provided) |

## 编码规范

- **日志**: 使用 Lombok `@Slf4j` + SLF4J，禁止 `System.out` / `java.util.logging`
- **线程安全注解**: 无状态类用 `@ThreadSafe`，有状态类用 `@NotThreadSafe`
- **Lombok**: 数据类用 `@Getter`/`@Setter`，record 类无需 Lombok
- **Proto 解析**: 使用 `Next.pojo.*` POJO record 的 `parseFrom(byte[])` 方法（基于 `ProtoParser` wire-format 解析 + `Pojos` 工具类）
- **异常处理**: 提取器内部捕获 `Exception`，不抛出到调用方
- **Java 版本**: 25 (Oracle GraalVM 25.0.2)，可使用 switch 表达式、record 等现代语法
- **禁止 `var`**: 所有变量必须使用显式类型声明
- **禁止全限定类名**: 通过 import 导入后使用短类名，禁止在代码中使用 `org.xxx.Yyy` 形式
- **POJO 类导入**: 使用 `import Next.pojo.XxxYyy` 形式，不要用通配符
- **POJO 类生成**: `gen_pojo.py` 从 proto 文件生成 `Next.pojo.*` record 类，每个消息一个文件，含 `parseFrom(byte[])` 和 `parseFrom(List<ProtoField>)` 方法
- **Proto 字段名**: POJO 使用 camelCase（如 `sceneCfgId`），注意 `SpaceActionCollection.entertedCatcher()` (proto 定义中的拼写错误)

## 目录结构

```
RocoMapTracker-sniffer/
├── pom.xml
├── CLAUDE.md
├── build_db.py               # JSON → SQLite 构建脚本
├── gen_pojo.py               # proto → Java record POJO 生成器
├── data/                      # 源 JSON 配置文件（8 个，供 build_db.py 使用）
└── src/main/
    ├── proto/                   # 66 个 .proto 文件（协议定义）
    ├── java/
    │   ├── Next/pojo/           # 3297 个生成的 POJO record（每个消息一个文件）
    │   │   ├── BattleDamageInfo.java
    │   │   ├── ZoneSceneMoveReq.java
    │   │   ├── ProtoMessages.java  # 索引文件
    │   │   └── ...
    │   └── com/roco/sniffer/
    │       ├── Main.java              # CLI 入口
    │       ├── RmtBridge.java         # 抓包管线主类
    │       ├── ExtractorRegistry.java # opcode 分发注册表
    │       ├── ExtractorContext.java   # 提取器共享上下文
    │       ├── EventExtractor.java    # 提取器接口
    │       ├── RmtSender.java         # TCP 消息发送
    │       ├── codec/                 # 协议编解码（纯工具，无状态）
    │       │   ├── Be21Packet.java    # BE21 帧 record
    │       │   ├── Be21Parser.java    # BE21 帧解析
    │       │   ├── Decryptor.java     # AES-128-CBC 解密
    │       │   ├── OpcodeReader.java  # opcode 快速提取
    │       │   ├── ProtoParser.java   # protobuf wire parser
    │       │   └── Pojos.java         # POJO 解析工具
    │       ├── capture/               # 抓包 & TCP 流管理
    │       │   ├── FlowState.java     # 单流状态（密钥、方向）
    │       │   └── DirectionState.java # TCP 流重组
    │       ├── data/                  # 数据层
    │       │   └── ConfigDb.java      # 游戏数据 SQLite 查询
    │       └── extractors/            # 12 个提取器类 + 3 个 lambda
    │           ├── SceneChangeExtractor.java
    │           ├── AreaEventExtractor.java
    │           ├── ItemPickupExtractor.java
    │           ├── PerformActionExtractor.java   # 4 个演出 opcode 共享
    │           ├── SwitchMainTeamExtractor.java  # Req+Rsp 合并
    │           └── ...
    └── resources/
        ├── logback.xml            # 日志配置
        └── META-INF/native-image/com.roco/RocoMapTracker-sniffer/
            └── reachability-metadata.json  # GraalVM native image 元数据（agent 自动生成）
```
