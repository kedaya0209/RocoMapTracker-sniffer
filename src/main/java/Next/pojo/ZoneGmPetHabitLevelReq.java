// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmPetHabitLevelReq(
    int uin,
    int level,
    List<Integer> habitList
) {
    public static ZoneGmPetHabitLevelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmPetHabitLevelReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneGmPetHabitLevelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmPetHabitLevelReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
