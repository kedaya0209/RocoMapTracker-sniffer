// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerPetMonitorDailyInfo(
    int obtainShinyCnt,
    int obtainGlassCnt,
    int obtainShinyGlassCnt
) {
    public static PlayerPetMonitorDailyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPetMonitorDailyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerPetMonitorDailyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPetMonitorDailyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
