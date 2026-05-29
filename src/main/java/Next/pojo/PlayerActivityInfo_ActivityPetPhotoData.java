// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityPetPhotoData(
    List<Integer> alreadyTakenPets,
    boolean isDisposableRewardTaken
) {
    public static PlayerActivityInfo_ActivityPetPhotoData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityPetPhotoData(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static PlayerActivityInfo_ActivityPetPhotoData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityPetPhotoData(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
