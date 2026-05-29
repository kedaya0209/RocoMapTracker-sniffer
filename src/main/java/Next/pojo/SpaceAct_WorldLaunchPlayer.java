// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldLaunchPlayer(
    long actorId,
    float forceXy,
    float forceZ,
    Position direction,
    float coolDown,
    SvrAISyncCommonInfo syncCommonInfo
) {
    public static SpaceAct_WorldLaunchPlayer parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldLaunchPlayer(
            Pojos.readLong(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static SpaceAct_WorldLaunchPlayer parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldLaunchPlayer(
            Pojos.readLong(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readFloat(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
