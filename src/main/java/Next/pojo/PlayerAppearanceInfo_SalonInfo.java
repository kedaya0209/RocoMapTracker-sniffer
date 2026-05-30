// Generated from com_appearance.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_SalonInfo(
    List<Integer> itemOwnedId,
    List<SalonItemWearData> itemWearData
) {
    public static PlayerAppearanceInfo_SalonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_SalonInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
    public static PlayerAppearanceInfo_SalonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_SalonInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
}
