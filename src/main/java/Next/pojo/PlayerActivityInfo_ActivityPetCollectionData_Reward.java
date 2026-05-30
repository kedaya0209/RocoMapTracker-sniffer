// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityPetCollectionData_Reward(
    int petBaseId,
    int rewardType
) {
    public static PlayerActivityInfo_ActivityPetCollectionData_Reward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityPetCollectionData_Reward(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerActivityInfo_ActivityPetCollectionData_Reward parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityPetCollectionData_Reward(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
