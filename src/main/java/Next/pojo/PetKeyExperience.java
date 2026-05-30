// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetKeyExperience(
    List<PetEvoluteInfo> evoluteInfo,
    PvpFirstWinInfo pvpFirstWinInfo,
    LegendFirstWinAloneInfo legendFirstWinAloneInfo,
    BlessingInfo blessingInfo,
    ObtainShinyFashionInfo obtainShinyFashionInfo,
    List<Integer> textDesc
) {
    public static PetKeyExperience parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetKeyExperience(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetEvoluteInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PvpFirstWinInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LegendFirstWinAloneInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BlessingInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ObtainShinyFashionInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readIntList(fields, 6)
        );
    }
    public static PetKeyExperience parseFrom(java.util.List<ProtoField> fields) {
        return new PetKeyExperience(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetEvoluteInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PvpFirstWinInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LegendFirstWinAloneInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BlessingInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ObtainShinyFashionInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readIntList(fields, 6)
        );
    }
}
