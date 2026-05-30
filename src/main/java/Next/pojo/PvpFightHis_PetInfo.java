// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PvpFightHis_PetInfo(
    int petBaseId,
    int mutationType,
    int petLevel,
    PetTypeInfo type
) {
    public static PvpFightHis_PetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpFightHis_PetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static PvpFightHis_PetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PvpFightHis_PetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
