// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo(
    int type,
    long npcId
) {
    public static ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2)
        );
    }
    public static ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_RelatedNpcInfos_ActorInfo_RelatedNpcInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2)
        );
    }
}
