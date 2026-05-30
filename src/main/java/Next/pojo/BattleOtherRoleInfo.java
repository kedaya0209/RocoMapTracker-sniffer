// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleOtherRoleInfo(
    int roleUin,
    List<BattlePetInfo> pets
) {
    public static BattleOtherRoleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleOtherRoleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList()
        );
    }
    public static BattleOtherRoleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleOtherRoleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList()
        );
    }
}
