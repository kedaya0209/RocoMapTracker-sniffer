// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUpdatePetCollectTagReq_CollectionInfo(
    int petGid,
    boolean isCollect,
    int partnerMark
) {
    public static ZoneUpdatePetCollectTagReq_CollectionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpdatePetCollectTagReq_CollectionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ZoneUpdatePetCollectTagReq_CollectionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpdatePetCollectTagReq_CollectionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
