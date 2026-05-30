// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetOwlSanctuaryFruitInfoRsp(
    RetInfo retInfo,
    OwlSanctuaryFruitInfo owlSanctuaryFruitInfo
) {
    public static ZoneGetOwlSanctuaryFruitInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetOwlSanctuaryFruitInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.OwlSanctuaryFruitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetOwlSanctuaryFruitInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetOwlSanctuaryFruitInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.OwlSanctuaryFruitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
