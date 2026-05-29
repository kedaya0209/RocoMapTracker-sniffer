package com.roco.sniffer.codec;

/**
 * 网络方向：客户端到服务端 / 服务端到客户端。
 */
public enum Direction {
    C2S("c2s"),
    S2C("s2c");

    private final String value;

    Direction(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
