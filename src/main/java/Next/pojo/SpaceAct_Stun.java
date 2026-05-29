// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_Stun(
    long actorId,
    boolean overrideDuration,
    float duration,
    SvrAISyncCommonInfo syncCommonInfo,
    float remainTime
) {
    public static SpaceAct_Stun parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_Stun(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5)
        );
    }
    public static SpaceAct_Stun parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_Stun(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5)
        );
    }
}
