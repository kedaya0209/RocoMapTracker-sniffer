// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlayZoomAnimation(
    long actorId,
    int animId,
    Position targetPos,
    float attachToTop,
    float playRate,
    float blendInTime,
    float blendOutTime,
    boolean decreasingCurve,
    String loopAnimName,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo
) {
    public static SpaceAct_PlayZoomAnimation parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlayZoomAnimation(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readString(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
    public static SpaceAct_PlayZoomAnimation parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlayZoomAnimation(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readString(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
}
