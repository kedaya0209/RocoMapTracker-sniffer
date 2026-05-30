package io.github.kedaya0209.roco.sniffer.data;

import Next.pojo.GoodsChangeItem;
import Next.pojo.PetData;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 精灵/玩家数据缓存（线程安全）。
 * <p>
 * 登录时由 TeamRosterExtractor 填充，运行时由各类提取器更新。
 */
public class PetCache {

    private final Map<Long, String> petNameCache = new ConcurrentHashMap<>();
    private final Map<Long, Integer> gidToConfId = new ConcurrentHashMap<>();
    private final Map<Long, Integer> petLevelCache = new ConcurrentHashMap<>();
    private final Map<Integer, String> playerNameCache = new ConcurrentHashMap<>();

    // ── 精灵名字查找 ──

    /** 精灵名字查找：通过 confId 从 petDb 查询，fallback 到登录缓存。 */
    public String petName(long gid, ConfigDb.NameDb petDb) {
        Integer confId = gidToConfId.get(gid);
        if (confId != null) {
            String name = petDb.lookup(confId);
            if (name != null) return name;
        }
        return petNameCache.get(gid);
    }

    /** 精灵标签：有名字返回名字，否则返回 pet#id。 */
    public String petLabel(int petId, ConfigDb.NameDb petDb) {
        String name = petName(petId, petDb);
        return (name != null) ? name : "pet#" + petId;
    }

    /** 精灵等级查找。 */
    public int petLevel(long gid) {
        return petLevelCache.getOrDefault(gid, 0);
    }

    /** 玩家名字查找。 */
    public String playerName(int uin) {
        return playerNameCache.get(uin);
    }

    // ── 缓存访问器 ──

    public Map<Long, String> petNameCache() { return petNameCache; }
    public Map<Long, Integer> gidToConfId() { return gidToConfId; }
    public Map<Long, Integer> petLevelCache() { return petLevelCache; }
    public Map<Integer, String> playerNameCache() { return playerNameCache; }

    /**
     * 从 goods_change_info.changes 中提取 PetData，更新 gid→confId 和名字缓存。
     */
    public void cachePetDataFromChanges(List<GoodsChangeItem> changes) {
        for (GoodsChangeItem item : changes) {
            if (item.petData() != null) {
                PetData petData = item.petData();
                long gid = petData.gid();
                if (gid > 0 && petData.confId() > 0) {
                    gidToConfId.put(gid, petData.confId());
                }
                String name = new String(petData.name(), StandardCharsets.UTF_8);
                if (!name.isEmpty()) {
                    petNameCache.put(gid, name);
                }
            }
        }
    }
}
