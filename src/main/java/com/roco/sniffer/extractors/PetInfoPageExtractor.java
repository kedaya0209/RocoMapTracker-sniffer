package com.roco.sniffer.extractors;

import lombok.extern.slf4j.Slf4j;
import Next.pojo.PetData;
import Next.pojo.PetDataInfoList;
import java.util.Set;
import Next.pojo.ZoneGetPetInfoByPageRsp;

/**
 * 0x1346 分页宠物数据（s2c）。
 * <p>
 * 登录时 ZoneLoginRsp 只携带部分精灵，剩余精灵通过此消息分页下发。
 * 每页包含 PetDataInfoList，从中提取 gid→confId 映射和名字。
 */
@Slf4j
public class PetInfoPageExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x1346); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneGetPetInfoByPageRsp rsp = ZoneGetPetInfoByPageRsp.parseFrom(payload);
            if (rsp.petInfo() == null) return;

            PetDataInfoList petInfo = rsp.petInfo();
            int count = 0;
            for (PetData pet : petInfo.petData()) {
                long gid = pet.gid();
                if (gid <= 0) continue;

                if (pet.confId() > 0) {
                    ctx.gidToConfId().put(gid, pet.confId());
                }
                String name = new String(pet.name(), java.nio.charset.StandardCharsets.UTF_8);
                if (!name.isEmpty()) {
                    ctx.petNameCache().put(gid, name);
                }
                count++;
            }
            if (count > 0) {
                log.debug("[pet-cache] 分页宠物数据 page={}/{} count={}",
                        rsp.reqPage(), rsp.totalPage(), count);
            }
        } catch (Exception e) {
            log.debug("0x1346 parseFrom 失败: {}", e.getMessage());
        }
    }
}
