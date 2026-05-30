// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_BodyTempNotify(
    long actorId,
    int bodyTempFinalVal,
    long reachFinalTime,
    int natureTemp
) {
    public static SpaceAct_BodyTempNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_BodyTempNotify(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static SpaceAct_BodyTempNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_BodyTempNotify(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
