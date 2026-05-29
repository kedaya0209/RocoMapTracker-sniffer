// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmBattleEndReq(
    int battleResult
) {
    public static ZoneGmBattleEndReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmBattleEndReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmBattleEndReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmBattleEndReq(
            Pojos.readInt(fields, 1)
        );
    }
}
