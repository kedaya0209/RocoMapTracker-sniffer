// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxChangePetReq(
    PetBoxPetChange oriInfo,
    PetBoxPetChange tarInfo
) {
    public static ZonePetBoxChangePetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxChangePetReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetBoxPetChange.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetBoxPetChange.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZonePetBoxChangePetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxChangePetReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetBoxPetChange.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetBoxPetChange.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
