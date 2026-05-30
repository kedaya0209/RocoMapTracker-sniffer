// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record InnerBattleInfo(
    int battleState,
    long worldNpcObjId,
    List<InnerBattlePetDisplay> sideAPets,
    List<InnerBattlePetDisplay> sideBPets,
    long bfdId,
    int battleConfId
) {
    public static InnerBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InnerBattleInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InnerBattlePetDisplay::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.InnerBattlePetDisplay::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static InnerBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new InnerBattleInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InnerBattlePetDisplay::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.InnerBattlePetDisplay::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
