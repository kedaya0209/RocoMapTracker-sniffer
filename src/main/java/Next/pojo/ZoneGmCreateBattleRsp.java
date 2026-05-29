// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmCreateBattleRsp(
    RetInfo retInfo,
    int status,
    Position queryPos,
    Position resultPos,
    boolean isFullStation,
    int dataLayer,
    int battleId
) {
    public static ZoneGmCreateBattleRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmCreateBattleRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static ZoneGmCreateBattleRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmCreateBattleRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
