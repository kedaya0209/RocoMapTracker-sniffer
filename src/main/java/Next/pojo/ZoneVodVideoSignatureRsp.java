// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneVodVideoSignatureRsp(
    RetInfo retInfo,
    String signature,
    String fileName
) {
    public static ZoneVodVideoSignatureRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneVodVideoSignatureRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
    public static ZoneVodVideoSignatureRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneVodVideoSignatureRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
}
