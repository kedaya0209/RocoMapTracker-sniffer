// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_MagicCreateNpc(
    List<MagicCreateNpcInfo> magicCreateNpcs
) {
    public static ActorInfo_MagicCreateNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_MagicCreateNpc(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MagicCreateNpcInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_MagicCreateNpc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_MagicCreateNpc(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MagicCreateNpcInfo::parseFrom).toList()
        );
    }
}
