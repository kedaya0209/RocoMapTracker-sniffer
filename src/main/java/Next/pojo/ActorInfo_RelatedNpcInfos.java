// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_RelatedNpcInfos(
    List<ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo> relatedNpcInfos
) {
    public static ActorInfo_RelatedNpcInfos parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_RelatedNpcInfos(
            Pojos.readMessageList(fields, 18).stream().map(Next.pojo.ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_RelatedNpcInfos parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_RelatedNpcInfos(
            Pojos.readMessageList(fields, 18).stream().map(Next.pojo.ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo::parseFrom).toList()
        );
    }
}
