// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellHomeBriefInfo(
    int uin,
    HomePlant_BriefInfo homePlantInfo,
    List<HomePetBriefInfo> homePets
) {
    public static CellHomeBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellHomeBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 30) != null ? Next.pojo.HomePlant_BriefInfo.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readMessageList(fields, 40).stream().map(Next.pojo.HomePetBriefInfo::parseFrom).toList()
        );
    }
    public static CellHomeBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CellHomeBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 30) != null ? Next.pojo.HomePlant_BriefInfo.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readMessageList(fields, 40).stream().map(Next.pojo.HomePetBriefInfo::parseFrom).toList()
        );
    }
}
