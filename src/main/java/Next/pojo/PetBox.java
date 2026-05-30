// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetBox(
    int boxId,
    int markType,
    List<Integer> petGid,
    int vacancyNum,
    byte[] boxName
) {
    public static PetBox parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetBox(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5)
        );
    }
    public static PetBox parseFrom(java.util.List<ProtoField> fields) {
        return new PetBox(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5)
        );
    }
}
