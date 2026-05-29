// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattlePkAgainNotify(
    int uin,
    boolean pkAgain
) {
    public static ZoneBattlePkAgainNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattlePkAgainNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneBattlePkAgainNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattlePkAgainNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
