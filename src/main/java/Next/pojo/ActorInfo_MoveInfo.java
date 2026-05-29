// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_MoveInfo(
    MoveInfo moveInfo
) {
    public static ActorInfo_MoveInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_MoveInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.MoveInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorInfo_MoveInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_MoveInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.MoveInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
