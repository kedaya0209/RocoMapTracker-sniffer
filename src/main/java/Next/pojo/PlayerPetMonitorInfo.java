// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerPetMonitorInfo(
    PlayerPetMonitorDailyInfo dailyInfo
) {
    public static PlayerPetMonitorInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPetMonitorInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPetMonitorDailyInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static PlayerPetMonitorInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPetMonitorInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPetMonitorDailyInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
