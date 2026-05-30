package io.github.kedaya0209.roco.sniffer.extractors;

import Next.pojo.GoodsChangeItem;

import io.github.kedaya0209.roco.sniffer.data.ConfigDb;
import io.github.kedaya0209.roco.sniffer.data.PetCache;
import io.github.kedaya0209.roco.sniffer.data.RuntimeState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 提取器共享上下文：提供配置数据库、运行时状态和缓存访问。
 * <p>
 * 由 RmtBridge 在创建时构造，传递给每个 EventExtractor.handle() 调用。
 * <p>
 * 内部委托到 {@link PetCache}（精灵/玩家缓存）和 {@link RuntimeState}（运行时状态），
 * 保留便捷委托方法以兼容现有提取器代码。
 */
public class ExtractorContext {

    private final ConfigDb configDb;
    private final BiConsumer<Integer, byte[]> enqueue;
    private final PetCache petCache;
    private final RuntimeState state;

    public ExtractorContext(ConfigDb configDb, BiConsumer<Integer, byte[]> enqueue) {
        this.configDb = configDb;
        this.enqueue = enqueue;
        this.petCache = new PetCache();
        this.state = new RuntimeState();
    }

    // ── 消息入队（统一缓冲池） ──

    /**
     * 将消息推入 IO 缓冲池，由 IO 线程统一刷出。
     *
     * @param serviceId MessageType.*.value()
     * @param payload   消息体
     */
    public void enqueue(int serviceId, byte[] payload) {
        enqueue.accept(serviceId, payload);
    }

    // ── 子组件访问器 ──

    public PetCache petCache() { return petCache; }
    public RuntimeState state() { return state; }

    // ── 配置数据库访问器 ──

    public ConfigDb configDb() { return configDb; }
    public ConfigDb.BagItemDb bagDb() { return configDb.bagItemDb(); }
    public ConfigDb.AreaFuncDb areaFuncDb() { return configDb.areaFuncDb(); }
    public ConfigDb.NameDb skillDb() { return configDb.skillDb(); }
    public ConfigDb.NameDb buffDb() { return configDb.buffDb(); }
    public ConfigDb.NameDb effectDb() { return configDb.effectDb(); }
    public ConfigDb.NameDb sceneNameDb() { return configDb.sceneNameDb(); }
    public ConfigDb.NameDb petDb() { return configDb.petDb(); }
    public ConfigDb.NameDb natureDb() { return configDb.natureDb(); }
    public ConfigDb.NameDb attributeDb() { return configDb.attributeDb(); }

    // ── 状态委托（委托到 RuntimeState） ──

    public int currentSceneId() { return state.currentSceneId(); }
    public void currentSceneId(int id) { state.currentSceneId(id); }

    public int currentAreaFuncId() { return state.currentAreaFuncId(); }
    public void currentAreaFuncId(int id) { state.currentAreaFuncId(id); }

    public boolean inMainWorld() { return state.inMainWorld(); }
    public void inMainWorld(boolean v) { state.inMainWorld(v); }

    public boolean inBattle() { return state.inBattle(); }
    public void inBattle(boolean v) { state.inBattle(v); }

    // ── 缓存委托（委托到 PetCache） ──

    /** 精灵名字查找：优先 confId → pet 表，fallback 到登录缓存 */
    public String petName(long gid) {
        return petCache.petName(gid, petDb());
    }

    /** 精灵标签：有名字返回名字，否则返回 pet#id */
    public String petLabel(int petId) {
        return petCache.petLabel(petId, petDb());
    }

    public Map<Long, String> petNameCache() { return petCache.petNameCache(); }
    public Map<Long, Integer> gidToConfId() { return petCache.gidToConfId(); }
    public Map<Long, Integer> petLevelCache() { return petCache.petLevelCache(); }

    /** 精灵等级查找 */
    public int petLevel(long gid) { return petCache.petLevel(gid); }

    /** 玩家名字查找 */
    public String playerName(int uin) { return petCache.playerName(uin); }

    public Map<Integer, String> playerNameCache() { return petCache.playerNameCache(); }

    /**
     * 从 goods_change_info.changes 中提取 PetData，更新 gid→confId 和名字缓存。
     */
    public void cachePetDataFromChanges(List<GoodsChangeItem> changes) {
        petCache.cachePetDataFromChanges(changes);
    }
}
