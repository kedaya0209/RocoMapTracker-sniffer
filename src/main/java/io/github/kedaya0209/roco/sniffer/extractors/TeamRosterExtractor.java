package io.github.kedaya0209.roco.sniffer.extractors;

import lombok.extern.slf4j.Slf4j;
import Next.pojo.PetData;
import Next.pojo.PetTeam;
import Next.pojo.PetTeamInfo;
import Next.pojo.PetTeam_PetInfo;
import Next.pojo.PlayerInfo;
import Next.pojo.PlayerBriefInfo;
import Next.pojo.PlayerPetInfo;
import Next.pojo.ZoneLoginRsp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 0x0102 队伍信息（s2c）。
 */
@Slf4j
public class TeamRosterExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x0102); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneLoginRsp rsp = ZoneLoginRsp.parseFrom(payload);
            PlayerInfo playerInfo = rsp.playerInfo();

            // 缓存玩家 uin → 名字
            if (playerInfo.briefInfo() != null) {
                PlayerBriefInfo brief = playerInfo.briefInfo();
                if (brief.uin() > 0) {
                    String playerName = new String(brief.name(), java.nio.charset.StandardCharsets.UTF_8);
                    if (!playerName.isEmpty()) {
                        ctx.playerNameCache().put(brief.uin(), playerName);
                        log.info("[login] 玩家: {} (uin={})", playerName, brief.uin());
                    }
                }
            }

            if (playerInfo.petInfo() == null) return;
            PlayerPetInfo petInfo = playerInfo.petInfo();

            // PetData[] → gid → (name, level, confId)，同时缓存到 ctx
            Map<Long, String> petNames = new LinkedHashMap<>();
            Map<Long, Long> petLevels = new LinkedHashMap<>();
            List<PetData> petDataList = petInfo.petData();
            for (PetData petData : petDataList) {
                long gid = petData.gid();
                if (gid <= 0) continue;
                String name = new String(petData.name(), java.nio.charset.StandardCharsets.UTF_8);
                if (name.isEmpty()) name = "???";
                petNames.put(gid, name);
                petLevels.put(gid, (long) petData.level());
                ctx.petNameCache().put(gid, name);
                ctx.petLevelCache().put(gid, petData.level());
                if (petData.confId() > 0) {
                    ctx.gidToConfId().put(gid, petData.confId());
                }
            }

            // teamInfo（单数）或 teamInfos（列表）都可能携带队伍数据，只取第一个
            PetTeamInfo teamInfo = null;
            if (!petInfo.teamInfos().isEmpty()) {
                teamInfo = petInfo.teamInfos().get(0);
            } else if (petInfo.teamInfo() != null) {
                teamInfo = petInfo.teamInfo();
            }

            long mainTeamIdx = teamInfo != null ? teamInfo.mainTeamIdx() : 0;

            log.info("[battle] 队伍信息 (共{}只精灵, 主力队: 第{}队)", petNames.size(), mainTeamIdx);

            if (teamInfo != null) {
                int idx = 0;
                List<PetTeam> teamsList = teamInfo.teams();
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
                        if (name == null) name = petNames.getOrDefault(gid, "#" + gid);
                        long level = petLevels.getOrDefault(gid, 0L);
                        petStrs.add(String.format("%s Lv.%d", name, level));
                    }

                    log.info("[battle]   ── {}{} ({}只) ──", label, marker, petStrs.size());
                    for (String s : petStrs) {
                        log.info("[battle]     {}", s);
                    }
                    idx++;
                }
            }
        } catch (Exception e) {
            log.debug("0x0102 parseFrom 失败: {}", e.getMessage());
        }
    }
}
