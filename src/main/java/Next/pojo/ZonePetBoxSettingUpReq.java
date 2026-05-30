// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetBoxSettingUpReq(
    List<Integer> boxIds
) {
    public static ZonePetBoxSettingUpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxSettingUpReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZonePetBoxSettingUpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxSettingUpReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
