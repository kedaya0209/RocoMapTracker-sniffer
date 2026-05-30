// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_OwlSanctuaryFruitInfoUpdate(
    int owlContentId,
    List<OwlSanctuaryFruitBriefInfo> fruitInfos,
    long uin,
    List<AvatarOwlSanctuaryInfo> owlSanctuaryInfos
) {
    public static SpaceAct_OwlSanctuaryFruitInfoUpdate parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_OwlSanctuaryFruitInfoUpdate(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitBriefInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AvatarOwlSanctuaryInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_OwlSanctuaryFruitInfoUpdate parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_OwlSanctuaryFruitInfoUpdate(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitBriefInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AvatarOwlSanctuaryInfo::parseFrom).toList()
        );
    }
}
