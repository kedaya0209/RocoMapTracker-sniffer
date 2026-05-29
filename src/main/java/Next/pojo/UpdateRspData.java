// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record UpdateRspData(
    int action,
    int arg,
    StartArg startArgs,
    BattleStartArg battleStartArg
) {
    public static UpdateRspData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new UpdateRspData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.StartArg.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleStartArg.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static UpdateRspData parseFrom(java.util.List<ProtoField> fields) {
        return new UpdateRspData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.StartArg.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleStartArg.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
