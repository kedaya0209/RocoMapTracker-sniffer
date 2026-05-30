// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record StealHomeInfo(
    int homeUin,
    List<StealHomePetInfo> stealOfHomePets
) {
    public static StealHomeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new StealHomeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.StealHomePetInfo::parseFrom).toList()
        );
    }
    public static StealHomeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new StealHomeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.StealHomePetInfo::parseFrom).toList()
        );
    }
}
