// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorPartData_GrassNpc(
    int grassCfgId,
    int refreshCfgId
) {
    public static ActorPartData_GrassNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPartData_GrassNpc(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ActorPartData_GrassNpc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPartData_GrassNpc(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
