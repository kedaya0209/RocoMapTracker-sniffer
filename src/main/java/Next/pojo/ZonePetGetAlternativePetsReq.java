// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetGetAlternativePetsReq(
    SharedPetInfo sharedPet,
    int teamType,
    List<Integer> teamMates
) {
    public static ZonePetGetAlternativePetsReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetGetAlternativePetsReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SharedPetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZonePetGetAlternativePetsReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetGetAlternativePetsReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SharedPetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
