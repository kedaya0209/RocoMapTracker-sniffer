// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGmDebugDrawCall(
    List<SceneGmDebugDrawCall> draws
) {
    public static ZoneSceneGmDebugDrawCall parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGmDebugDrawCall(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SceneGmDebugDrawCall::parseFrom).toList()
        );
    }
    public static ZoneSceneGmDebugDrawCall parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGmDebugDrawCall(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SceneGmDebugDrawCall::parseFrom).toList()
        );
    }
}
