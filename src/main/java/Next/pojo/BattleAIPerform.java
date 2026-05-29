// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleAIPerform(
    int petId,
    int uin,
    int onlookerId,
    int type,
    int param,
    String strParam,
    String soundId,
    boolean audience
) {
    public static BattleAIPerform parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleAIPerform(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readBool(fields, 8)
        );
    }
    public static BattleAIPerform parseFrom(java.util.List<ProtoField> fields) {
        return new BattleAIPerform(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readBool(fields, 8)
        );
    }
}
