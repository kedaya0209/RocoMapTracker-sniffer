package com.roco.sniffer.extractors;

import java.util.Set;

/**
 * 事件提取器接口：从 protobuf payload 中提取语义信息并处理。
 * <p>
 * 通过 {@link ExtractorRegistry} 注册后，RmtBridge 自动按 opcode 分发。
 * 实现 {@link #supportedOpcodes()} 声明支持的 opcode，注册时自动发现。
 * <p>
 * 实现要求：
 * <ul>
 *   <li>无状态 — 实例在多线程解码线程中共享</li>
 *   <li>快速返回 — 不做阻塞 I/O</li>
 *   <li>异常内部捕获 — 不应抛出到调用方</li>
 * </ul>
 */
@FunctionalInterface
public interface EventExtractor {

    /**
     * 处理解码后的 protobuf payload。
     *
     * @param opcode  消息 opcode
     * @param payload 去除传输层头 + TSF4G 尾部后的 protobuf 原始字节
     * @param ctx     共享上下文（提供配置数据库、消息入队、状态访问）
     */
    void handle(int opcode, byte[] payload, ExtractorContext ctx);

    /**
     * 返回此提取器支持的 opcode 集合。
     * <p>
     * 具体类应覆盖此方法声明支持的 opcode。
     * Lambda 提取器继承默认空集，需通过 {@link ExtractorRegistry#register(int, EventExtractor)} 手动注册。
     *
     * @return 支持的 opcode 集合，空集表示不支持自动注册
     */
    default Set<Integer> supportedOpcodes() {
        return Set.of();
    }
}
