// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetCosUploadUrlRsp(
    RetInfo retInfo,
    String url,
    int type,
    String fileName,
    String genFilename,
    String accessUrl
) {
    public static ZoneGetCosUploadUrlRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetCosUploadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
    public static ZoneGetCosUploadUrlRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetCosUploadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
}
