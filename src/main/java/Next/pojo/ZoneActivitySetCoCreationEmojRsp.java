// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneActivitySetCoCreationEmojRsp(
    RetInfo retInfo,
    ActivityCoCreationEmojInfo emojInfo,
    List<Integer> emojList
) {
    public static ZoneActivitySetCoCreationEmojRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivitySetCoCreationEmojRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActivityCoCreationEmojInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneActivitySetCoCreationEmojRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivitySetCoCreationEmojRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActivityCoCreationEmojInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
}
