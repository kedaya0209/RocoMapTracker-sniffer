// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneActivityGetCoCreationEmojRsp(
    RetInfo retInfo,
    ActivityCoCreationEmojInfo emojInfo,
    List<Integer> emojList
) {
    public static ZoneActivityGetCoCreationEmojRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivityGetCoCreationEmojRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActivityCoCreationEmojInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneActivityGetCoCreationEmojRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivityGetCoCreationEmojRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActivityCoCreationEmojInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
}
