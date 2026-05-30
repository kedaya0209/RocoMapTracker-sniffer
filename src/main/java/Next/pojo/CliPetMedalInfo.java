// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CliPetMedalInfo(
    List<PetMedalRecord> collection
) {
    public static CliPetMedalInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CliPetMedalInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetMedalRecord::parseFrom).toList()
        );
    }
    public static CliPetMedalInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CliPetMedalInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetMedalRecord::parseFrom).toList()
        );
    }
}
