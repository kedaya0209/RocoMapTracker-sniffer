// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxLastOpenBoxRsp(
    RetInfo retInfo,
    int boxId
) {
    public static ZonePetBoxLastOpenBoxRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxLastOpenBoxRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static ZonePetBoxLastOpenBoxRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxLastOpenBoxRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
