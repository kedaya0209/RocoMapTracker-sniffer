package io.github.kedaya0209.roco.sniffer.extractors;

import lombok.extern.slf4j.Slf4j;
import Next.pojo.PetTeam;
import Next.pojo.PetTeamInfo;
import Next.pojo.PetTeam_PetInfo;
import Next.pojo.GoodsChangeItem;
import Next.pojo.ZonePetChangeMainTeamReq;
import Next.pojo.ZonePetChangeMainTeamRsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 0x020E 切换主力队伍请求（c2s）/ 0x020F 切换主力队伍响应（s2c）。
 */
@Slf4j
public class SwitchMainTeamExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x020E, 0x020F); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            switch (opcode) {
                case 0x020E -> {
                    ZonePetChangeMainTeamReq req = ZonePetChangeMainTeamReq.parseFrom(payload);
                    log.info("[team] 切换主力队伍: 第{}队 (type={})", req.mainTeamIdx(), req.teamType());
                }
                case 0x020F -> {
                    ZonePetChangeMainTeamRsp rsp = ZonePetChangeMainTeamRsp.parseFrom(payload);
                    if (rsp.retInfo() == null) return;
                    int code = rsp.retInfo().retCode();
                    if (code != 0) {
                        log.warn("[team] 切换主力队伍: 失败 code={} msg={}", code, rsp.retInfo().retMsg());
                        return;
                    }
                    // 从 goods_change_info 中提取 PetTeamInfo
                    if (rsp.retInfo().goodsChangeInfo() == null) {
                        log.info("[team] 切换主力队伍: 成功（无队伍详情）");
                        return;
                    }
                    List<GoodsChangeItem> changes = rsp.retInfo().goodsChangeInfo().changes();
                    ctx.cachePetDataFromChanges(changes);
                    PetTeamInfo teamInfo = null;
                    for (GoodsChangeItem item : changes) {
                        if (item.teamInfo() != null) {
                            teamInfo = item.teamInfo();
                        }
                    }
                    if (teamInfo == null) {
                        log.info("[team] 切换主力队伍: 成功（无队伍详情）");
                        return;
                    }
                    logTeamInfo(teamInfo, ctx);
                }
                default -> {}
            }
        } catch (Exception e) {
            log.debug("0x{} parseFrom 失败: {}", String.format("%04X", opcode), e.getMessage());
        }
    }

    private void logTeamInfo(PetTeamInfo teamInfo, ExtractorContext ctx) {
        long mainTeamIdx = teamInfo.mainTeamIdx();
        log.info("[team] 切换主力队伍: 成功 (主力队: 第{}队)", mainTeamIdx);
        List<PetTeam> teamsList = teamInfo.teams();
        int idx = 0;
        for (PetTeam team : teamsList) {
            String teamName = team.teamName();
            boolean isMain = (idx == mainTeamIdx);
            String label = (!teamName.isEmpty()) ? teamName : "第" + idx + "队";
            String marker = isMain ? " ★" : "";

            List<String> petStrs = new ArrayList<>();
            List<PetTeam_PetInfo> petInfosList = team.petInfos();
            for (PetTeam_PetInfo petEntry : petInfosList) {
                long gid = petEntry.petGid();
                String name = ctx.petName(gid);
                if (name == null) name = "#" + gid;
                petStrs.add(name);
            }

            log.info("[team]   ── {}{} ({}只) ──", label, marker, petStrs.size());
            for (String s : petStrs) {
                log.info("[team]     {}", s);
            }
            idx++;
        }
    }
}
