package com.roco.sniffer.capture;

/**
 * TCP 流标识：客户端 IP:端口 → 服务端 IP:端口。
 */
public record FlowKey(String clientIp, int clientPort, String serverIp, int serverPort) {

    /** 兼容旧的 String 格式，用于日志输出。 */
    @Override
    public String toString() {
        return clientIp + ":" + clientPort + "->" + serverIp + ":" + serverPort;
    }
}
