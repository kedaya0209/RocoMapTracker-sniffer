// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmUnlockWorldMapStaticNpcReq(
    int npcRefreshCfgId,
    boolean excludeDungeon
) {
    public static ZoneGmUnlockWorldMapStaticNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmUnlockWorldMapStaticNpcReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneGmUnlockWorldMapStaticNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmUnlockWorldMapStaticNpcReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
