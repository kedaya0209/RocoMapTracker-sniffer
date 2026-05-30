// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetMobileBindInfoRsp(
    RetInfo retInfo,
    String maskMobileNum,
    int uin,
    String openid,
    int bindFlag,
    String localMobileNum,
    String bindUseSmsWithBtn,
    String unbind,
    String unbindGameConfirmation,
    String unbindGameResult,
    String unbindChannelConfirmation,
    String unbindChannelResult,
    String unbindConfirmation,
    String unbindResult
) {
    public static ZoneGetMobileBindInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetMobileBindInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readString(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readString(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readString(fields, 13),
            Pojos.readString(fields, 14)
        );
    }
    public static ZoneGetMobileBindInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetMobileBindInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readString(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readString(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readString(fields, 13),
            Pojos.readString(fields, 14)
        );
    }
}
