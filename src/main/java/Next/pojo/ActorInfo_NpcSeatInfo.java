// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcSeatInfo(
    List<NpcSeatInfoOne> seatInfo
) {
    public static ActorInfo_NpcSeatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcSeatInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.NpcSeatInfoOne::parseFrom).toList()
        );
    }
    public static ActorInfo_NpcSeatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcSeatInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.NpcSeatInfoOne::parseFrom).toList()
        );
    }
}
