// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivitySpringFestivalData(
    List<Integer> globalPopularityTaskIds
) {
    public static PlayerActivityInfo_ActivitySpringFestivalData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivitySpringFestivalData(
            Pojos.readIntList(fields, 1)
        );
    }
    public static PlayerActivityInfo_ActivitySpringFestivalData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivitySpringFestivalData(
            Pojos.readIntList(fields, 1)
        );
    }
}
