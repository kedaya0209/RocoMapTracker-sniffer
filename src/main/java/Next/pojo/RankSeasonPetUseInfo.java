// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RankSeasonPetUseInfo(
    int petBaseCfgId,
    int useTimes,
    List<PetSkillUseInfo> petSkillUseInfo
) {
    public static RankSeasonPetUseInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RankSeasonPetUseInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetSkillUseInfo::parseFrom).toList()
        );
    }
    public static RankSeasonPetUseInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RankSeasonPetUseInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetSkillUseInfo::parseFrom).toList()
        );
    }
}
