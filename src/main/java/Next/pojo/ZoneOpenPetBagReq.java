// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneOpenPetBagReq(
    List<Integer> petGid
) {
    public static ZoneOpenPetBagReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneOpenPetBagReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneOpenPetBagReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneOpenPetBagReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
