// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetEquipSkillReq(
    List<PetSkillEquipInfo> equipInfo,
    int gid,
    int teamType
) {
    public static ZonePetEquipSkillReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetEquipSkillReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetSkillEquipInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZonePetEquipSkillReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetEquipSkillReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetSkillEquipInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
