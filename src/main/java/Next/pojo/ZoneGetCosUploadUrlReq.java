// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetCosUploadUrlReq(
    int type,
    String fileName,
    int fileSize,
    String fileMd5,
    long battleId,
    String clientVersion
) {
    public static ZoneGetCosUploadUrlReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetCosUploadUrlReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
    public static ZoneGetCosUploadUrlReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetCosUploadUrlReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
}
