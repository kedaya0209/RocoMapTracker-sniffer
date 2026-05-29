package com.roco.sniffer;

import Next.pojo.GoodsChangeItem;
import Next.pojo.PetData;

import com.roco.sniffer.data.ConfigDb;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;

/**
 * 提取器共享上下文：提供 RmtSender、配置数据库和运行时状态访问。
 * <p>
 * 由 RmtBridge 在创建时构造，传递给每个 EventExtractor.handle() 调用。
 */
public class ExtractorContext {

    private final ConfigDb.BagItemDb bagDb;
    private final ConfigDb.AreaFuncDb areaFuncDb;
    private final ConfigDb.NameDb skillDb;
    private final ConfigDb.NameDb buffDb;
    private final ConfigDb.NameDb effectDb;
    private final ConfigDb.NameDb sceneNameDb;
    private final ConfigDb.NameDb petDb;
    private final ConfigDb.NameDb natureDb;
    private final ConfigDb.NameDb attributeDb;
    private final BiConsumer<Integer, byte[]> enqueue;

    // ── 运行时状态（volatile，由多个解码线程读写） ──
    private volatile int currentSceneId = -1;
    private volatile int currentAreaFuncId = -1;
    private volatile boolean inMainWorld;
    private volatile boolean inBattle;

    // ── 精灵数据缓存（登录时由 TeamRosterExtractor 填充） ──
    private final Map<Long, String> petNameCache = new ConcurrentHashMap<>();
    private final Map<Long, Integer> gidToConfId = new ConcurrentHashMap<>();
    private final Map<Long, Integer> petLevelCache = new ConcurrentHashMap<>();

    // ── 玩家数据缓存（登录时由 TeamRosterExtractor 填充） ──
    private final Map<Integer, String> playerNameCache = new ConcurrentHashMap<>();

    public ExtractorContext(ConfigDb.BagItemDb bagDb,
                            ConfigDb.AreaFuncDb areaFuncDb,
                            ConfigDb.NameDb skillDb,
                            ConfigDb.NameDb buffDb,
                            ConfigDb.NameDb effectDb,
                            ConfigDb.NameDb sceneNameDb,
                            ConfigDb.NameDb petDb,
                            ConfigDb.NameDb natureDb,
                            ConfigDb.NameDb attributeDb,
                            BiConsumer<Integer, byte[]> enqueue) {
        this.bagDb = bagDb;
        this.areaFuncDb = areaFuncDb;
        this.skillDb = skillDb;
        this.buffDb = buffDb;
        this.effectDb = effectDb;
        this.sceneNameDb = sceneNameDb;
        this.petDb = petDb;
        this.natureDb = natureDb;
        this.attributeDb = attributeDb;
        this.enqueue = enqueue;
    }

    // ── 消息入队（统一缓冲池） ──

    /**
     * 将消息推入 IO 缓冲池，由 IO 线程统一刷出。
     *
     * @param serviceId RmtSender.MSG_xxx
     * @param payload   消息体
     */
    public void enqueue(int serviceId, byte[] payload) {
        enqueue.accept(serviceId, payload);
    }

    // ── 访问器 ──

    public ConfigDb.BagItemDb bagDb() { return bagDb; }
    public ConfigDb.AreaFuncDb areaFuncDb() { return areaFuncDb; }
    public ConfigDb.NameDb skillDb() { return skillDb; }
    public ConfigDb.NameDb buffDb() { return buffDb; }
    public ConfigDb.NameDb effectDb() { return effectDb; }
    public ConfigDb.NameDb sceneNameDb() { return sceneNameDb; }
    public ConfigDb.NameDb petDb() { return petDb; }
    public ConfigDb.NameDb natureDb() { return natureDb; }
    public ConfigDb.NameDb attributeDb() { return attributeDb; }

    // ── 状态读写 ──

    public int currentSceneId() { return currentSceneId; }
    public void currentSceneId(int id) { this.currentSceneId = id; }

    public int currentAreaFuncId() { return currentAreaFuncId; }
    public void currentAreaFuncId(int id) { this.currentAreaFuncId = id; }

    public boolean inMainWorld() { return inMainWorld; }
    public void inMainWorld(boolean v) { this.inMainWorld = v; }

    public boolean inBattle() { return inBattle; }
    public void inBattle(boolean v) { this.inBattle = v; }

    /** 精灵名字查找：优先 confId → pet 表，fallback 到登录缓存 */
    public String petName(long gid) {
        Integer confId = gidToConfId.get(gid);
        if (confId != null) {
            String name = petDb.lookup(confId);
            if (name != null) return name;
        }
        return petNameCache.get(gid);
    }

    /** 精灵标签：有名字返回名字，否则返回 pet#id */
    public String petLabel(int petId) {
        String name = petName(petId);
        return (name != null) ? name : "pet#" + petId;
    }

    public Map<Long, String> petNameCache() { return petNameCache; }
    public Map<Long, Integer> gidToConfId() { return gidToConfId; }
    public Map<Long, Integer> petLevelCache() { return petLevelCache; }

    /** 精灵等级查找 */
    public int petLevel(long gid) {
        return petLevelCache.getOrDefault(gid, 0);
    }

    /** 玩家名字查找 */
    public String playerName(int uin) {
        return playerNameCache.get(uin);
    }

    public Map<Integer, String> playerNameCache() { return playerNameCache; }

    /**
     * 从 goods_change_info.changes 中提取所有 GT_PET 类型的 PetData，更新 gid→confId 和名字缓存。
     * 任何携带 ret_info 的响应都可能包含此数据。
     */
    public void cachePetDataFromChanges(List<GoodsChangeItem> changes) {
        for (GoodsChangeItem item : changes) {
            if (item.petData() != null) {
                PetData petData = item.petData();
                long gid = petData.gid();
                if (gid > 0 && petData.confId() > 0) {
                    gidToConfId.put(gid, petData.confId());
                }
                String name = new String(petData.name(), java.nio.charset.StandardCharsets.UTF_8);
                if (!name.isEmpty()) {
                    petNameCache.put(gid, name);
                }
            }
        }
    }
}
