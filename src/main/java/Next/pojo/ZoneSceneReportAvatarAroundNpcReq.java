// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneReportAvatarAroundNpcReq(
    long npcObjId,
    long npcLogicId,
    boolean enter
) {
    public static ZoneSceneReportAvatarAroundNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneReportAvatarAroundNpcReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneSceneReportAvatarAroundNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneReportAvatarAroundNpcReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
