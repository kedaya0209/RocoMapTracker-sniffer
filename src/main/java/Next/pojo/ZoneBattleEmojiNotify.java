// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleEmojiNotify(
    int emoji,
    int aimUin,
    int srcUin
) {
    public static ZoneBattleEmojiNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleEmojiNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneBattleEmojiNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleEmojiNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
