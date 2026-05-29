package com.roco.sniffer.extractors;

import com.roco.sniffer.codec.MessageType;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.GoodsChangeItem;
import Next.pojo.GoodsItem;
import Next.pojo.RetInfo;
import Next.pojo.ZoneGoodsRewardNotify;

import java.util.List;
import java.util.Set;

/**
 * 0x0243 物品拾取（s2c）。
 * <p>
 * 拾取事件通过 ctx.enqueue() 推入统一缓冲池，由 IO 线程统一刷出。
 */
@Slf4j
public class ItemPickupExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x0243); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneGoodsRewardNotify notify = ZoneGoodsRewardNotify.parseFrom(payload);
            RetInfo retInfo = notify.retInfo();
            if (retInfo.goodsReward() == null || retInfo.goodsReward().rewards().isEmpty()) return;

            List<GoodsChangeItem> changesList = retInfo.goodsChangeInfo() != null
                    ? retInfo.goodsChangeInfo().changes() : List.of();
            ctx.cachePetDataFromChanges(changesList);

            List<GoodsItem> rewardsList = retInfo.goodsReward().rewards();
            for (GoodsItem reward : rewardsList) {
                int itemId = reward.id();
                if (itemId <= 0) continue;
                int pickupNum = reward.num();

                int totalNum = 0;
                for (GoodsChangeItem change : changesList) {
                    if (change.bagItem() != null && change.bagItem().id() == itemId) {
                        totalNum = (int) change.bagItem().num();
                    }
                }

                String tag = ctx.bagDb().lookup(itemId);
                if (tag == null) tag = "#" + itemId;

                byte[] body = String.format("%s|%d|%d", tag, pickupNum, totalNum)
                        .getBytes(java.nio.charset.StandardCharsets.UTF_8);
                ctx.enqueue(MessageType.ITEM_PICKUP.value(), body);
                log.info("[pickup] {} x{}", tag, pickupNum);
            }
        } catch (Exception e) {
            log.debug("0x0243 parseFrom 失败: {}", e.getMessage());
        }
    }
}
