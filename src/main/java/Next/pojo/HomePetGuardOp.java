// Generated from home_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomePetGuardOp(
    int petGid,
    int opType,
    SceneBasePetData petBaseData
) {
    public static HomePetGuardOp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetGuardOp(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SceneBasePetData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static HomePetGuardOp parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetGuardOp(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SceneBasePetData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
