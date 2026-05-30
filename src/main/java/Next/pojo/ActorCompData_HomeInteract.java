// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_HomeInteract(
    List<StealHomeInfo> stealOfHomes,
    int totalStealedNum,
    long lastStealTimestamp
) {
    public static ActorCompData_HomeInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_HomeInteract(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.StealHomeInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ActorCompData_HomeInteract parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_HomeInteract(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.StealHomeInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
