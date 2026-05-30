// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OwlSanctuaryPetEggInfo(
    int owlSanctuaryId,
    List<RefreshPetEggData> owlSanctuaryPetEggData
) {
    public static OwlSanctuaryPetEggInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryPetEggInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RefreshPetEggData::parseFrom).toList()
        );
    }
    public static OwlSanctuaryPetEggInfo parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryPetEggInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RefreshPetEggData::parseFrom).toList()
        );
    }
}
