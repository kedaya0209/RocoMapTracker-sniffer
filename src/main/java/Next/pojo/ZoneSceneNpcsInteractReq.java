// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneNpcsInteractReq(
    long npcId,
    int optionId,
    long sourceNpcId
) {
    public static ZoneSceneNpcsInteractReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNpcsInteractReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneSceneNpcsInteractReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNpcsInteractReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
