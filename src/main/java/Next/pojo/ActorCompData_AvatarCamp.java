// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_AvatarCamp(
    List<Integer> unlockedCamp,
    List<CampRefreshPetEggInfo> campPetEggInfo
) {
    public static ActorCompData_AvatarCamp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_AvatarCamp(
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.CampRefreshPetEggInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_AvatarCamp parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_AvatarCamp(
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.CampRefreshPetEggInfo::parseFrom).toList()
        );
    }
}
