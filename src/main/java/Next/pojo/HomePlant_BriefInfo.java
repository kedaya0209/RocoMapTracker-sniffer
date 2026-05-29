// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePlant_BriefInfo(
    List<HomePlant_LandBriefInfo> homePlantLandList,
    boolean unlock
) {
    public static HomePlant_BriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePlant_BriefInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HomePlant_LandBriefInfo::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
    public static HomePlant_BriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePlant_BriefInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HomePlant_LandBriefInfo::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
}
