// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetTeamShareData(
    List<Integer> validPetGids
) {
    public static PetTeamShareData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTeamShareData(
            Pojos.readIntList(fields, 1)
        );
    }
    public static PetTeamShareData parseFrom(java.util.List<ProtoField> fields) {
        return new PetTeamShareData(
            Pojos.readIntList(fields, 1)
        );
    }
}
