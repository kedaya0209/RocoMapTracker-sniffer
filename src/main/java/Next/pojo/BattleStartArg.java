// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleStartArg(
    int startBattleType,
    PVEStartArg pveStartArg,
    int playerType,
    int isMainAgent,
    int startArgNumPets
) {
    public static BattleStartArg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleStartArg(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PVEStartArg.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static BattleStartArg parseFrom(java.util.List<ProtoField> fields) {
        return new BattleStartArg(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PVEStartArg.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
