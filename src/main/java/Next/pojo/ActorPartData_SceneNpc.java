// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorPartData_SceneNpc(
    int sceneNpcCfgId,
    boolean isServerAi
) {
    public static ActorPartData_SceneNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPartData_SceneNpc(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ActorPartData_SceneNpc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPartData_SceneNpc(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
