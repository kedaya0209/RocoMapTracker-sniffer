// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmCreateNpcReq(
    boolean onlyTest,
    int npcType,
    Point npcPos,
    int contentCfgId,
    boolean isNightmareElite
) {
    public static ZoneGmCreateNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmCreateNpcReq(
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 5)
        );
    }
    public static ZoneGmCreateNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmCreateNpcReq(
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 5)
        );
    }
}
