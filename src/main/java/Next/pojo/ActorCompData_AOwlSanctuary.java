// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_AOwlSanctuary(
    List<Integer> generatedContentIds,
    List<AvatarOwlSanctuaryInfo> owlSanctuaryDatas,
    List<OwlSanctuaryPetEggInfo> owlSanctuaryPetEggInfo,
    int currentUsedContentId
) {
    public static ActorCompData_AOwlSanctuary parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_AOwlSanctuary(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AvatarOwlSanctuaryInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.OwlSanctuaryPetEggInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6)
        );
    }
    public static ActorCompData_AOwlSanctuary parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_AOwlSanctuary(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AvatarOwlSanctuaryInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.OwlSanctuaryPetEggInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6)
        );
    }
}
