// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleRoundFlowFinishRsp(
    RetInfo retInfo,
    boolean isFinish
) {
    public static ZoneBattleRoundFlowFinishRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleRoundFlowFinishRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneBattleRoundFlowFinishRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleRoundFlowFinishRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
}
