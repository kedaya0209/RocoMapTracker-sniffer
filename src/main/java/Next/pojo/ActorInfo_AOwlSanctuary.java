// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_AOwlSanctuary(
    List<AvatarOwlSanctuaryInfo> owlSanctuarys,
    int uin
) {
    public static ActorInfo_AOwlSanctuary parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AOwlSanctuary(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AvatarOwlSanctuaryInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static ActorInfo_AOwlSanctuary parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AOwlSanctuary(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AvatarOwlSanctuaryInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
