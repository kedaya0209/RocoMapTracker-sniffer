// Generated from nrcai.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record UpdateReqData(
    BattleStateInfo battleStateInfo,
    ExtraBattleStateInfo extraBattleStateInfo
) {
    public static UpdateReqData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new UpdateReqData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleStateInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ExtraBattleStateInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static UpdateReqData parseFrom(java.util.List<ProtoField> fields) {
        return new UpdateReqData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleStateInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ExtraBattleStateInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
