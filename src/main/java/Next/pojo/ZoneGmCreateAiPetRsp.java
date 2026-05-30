// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmCreateAiPetRsp(
    RetInfo retInfo,
    PetData petData
) {
    public static ZoneGmCreateAiPetRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmCreateAiPetRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGmCreateAiPetRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmCreateAiPetRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
