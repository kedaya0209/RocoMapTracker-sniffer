// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityFlowerAppearData(
    int activitySubId,
    List<Integer> flowerSeedContentId
) {
    public static PlayerActivityInfo_ActivityFlowerAppearData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityFlowerAppearData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static PlayerActivityInfo_ActivityFlowerAppearData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityFlowerAppearData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
