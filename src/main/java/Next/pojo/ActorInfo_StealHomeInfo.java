// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_StealHomeInfo(
    int totalStealNum,
    List<StealHomePetInfo> stealOfHomePets
) {
    public static ActorInfo_StealHomeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_StealHomeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.StealHomePetInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_StealHomeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_StealHomeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.StealHomePetInfo::parseFrom).toList()
        );
    }
}
