// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneData_Normal(
    long sceneId,
    SpaceObjPartData_InstalledComp installedComps
) {
    public static SceneData_Normal parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneData_Normal(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.SpaceObjPartData_InstalledComp.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
    public static SceneData_Normal parseFrom(java.util.List<ProtoField> fields) {
        return new SceneData_Normal(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.SpaceObjPartData_InstalledComp.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
}
