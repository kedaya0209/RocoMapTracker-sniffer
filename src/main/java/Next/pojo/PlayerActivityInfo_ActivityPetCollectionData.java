// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityPetCollectionData(
    int disposableRewardTakenTime,
    List<Integer> collectionPet,
    List<Integer> collectionPetRewards,
    List<PlayerActivityInfo_ActivityPetCollectionData_Reward> petRewards
) {
    public static PlayerActivityInfo_ActivityPetCollectionData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityPetCollectionData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerActivityInfo_ActivityPetCollectionData_Reward::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityPetCollectionData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityPetCollectionData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PlayerActivityInfo_ActivityPetCollectionData_Reward::parseFrom).toList()
        );
    }
}
