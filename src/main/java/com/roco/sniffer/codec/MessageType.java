package com.roco.sniffer.codec;

/**
 * RMT 协议消息类型常量。
 */
public enum MessageType {
    HELLO(1),
    SCENE_CHANGE(211),
    STOP_MATCHING(212),
    START_MATCHING(213),
    AREA_CHANGE(214),
    ITEM_PICKUP(215);

    private final int value;

    MessageType(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
