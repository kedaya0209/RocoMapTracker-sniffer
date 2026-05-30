// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBusinessCardUploadSuccessRsp(
    RetInfo retInfo,
    PlayerBusinessCardInfo businessCardInfo
) {
    public static ZoneBusinessCardUploadSuccessRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBusinessCardUploadSuccessRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBusinessCardInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneBusinessCardUploadSuccessRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBusinessCardUploadSuccessRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBusinessCardInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
