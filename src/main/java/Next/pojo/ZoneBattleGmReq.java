// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleGmReq(
    int gmType,
    int gmOpType,
    int uin,
    int param1,
    int param2,
    int param3,
    int param4,
    int param5,
    int param6,
    String strParam,
    int side,
    int pos
) {
    public static ZoneBattleGmReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleGmReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static ZoneBattleGmReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleGmReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
