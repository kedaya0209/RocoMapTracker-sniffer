package com.roco.sniffer.data;

/**
 * 运行时状态（volatile，由多个解码线程读写）。
 */
public class RuntimeState {

    private volatile int currentSceneId = -1;
    private volatile int currentAreaFuncId = -1;
    private volatile boolean inMainWorld;
    private volatile boolean inBattle;

    public int currentSceneId() { return currentSceneId; }
    public void currentSceneId(int id) { this.currentSceneId = id; }

    public int currentAreaFuncId() { return currentAreaFuncId; }
    public void currentAreaFuncId(int id) { this.currentAreaFuncId = id; }

    public boolean inMainWorld() { return inMainWorld; }
    public void inMainWorld(boolean v) { this.inMainWorld = v; }

    public boolean inBattle() { return inBattle; }
    public void inBattle(boolean v) { this.inBattle = v; }
}
