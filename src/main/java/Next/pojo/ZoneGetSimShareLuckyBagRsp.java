// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetSimShareLuckyBagRsp(
    RetInfo retInfo,
    String giftCode
) {
    public static ZoneGetSimShareLuckyBagRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetSimShareLuckyBagRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2)
        );
    }
    public static ZoneGetSimShareLuckyBagRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetSimShareLuckyBagRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2)
        );
    }
}
