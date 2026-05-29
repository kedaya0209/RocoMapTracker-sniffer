// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleCommentTriggerReq(
    BattlerCommentData commentData
) {
    public static ZoneBattleCommentTriggerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleCommentTriggerReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlerCommentData.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneBattleCommentTriggerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleCommentTriggerReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlerCommentData.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
