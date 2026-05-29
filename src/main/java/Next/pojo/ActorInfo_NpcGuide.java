// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcGuide(
    List<NpcGuideInfo> guideInfos
) {
    public static ActorInfo_NpcGuide parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcGuide(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcGuideInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_NpcGuide parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcGuide(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcGuideInfo::parseFrom).toList()
        );
    }
}
