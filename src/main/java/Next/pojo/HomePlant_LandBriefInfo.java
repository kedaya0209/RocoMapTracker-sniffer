// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePlant_LandBriefInfo(
    List<HomePlant_PlantBriefInfo> homePlantList
) {
    public static HomePlant_LandBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePlant_LandBriefInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomePlant_PlantBriefInfo::parseFrom).toList()
        );
    }
    public static HomePlant_LandBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePlant_LandBriefInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomePlant_PlantBriefInfo::parseFrom).toList()
        );
    }
}
