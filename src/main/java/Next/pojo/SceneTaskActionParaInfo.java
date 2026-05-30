// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneTaskActionParaInfo(
    long actionParamId,
    int isFinish,
    long npcObjId
) {
    public static SceneTaskActionParaInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneTaskActionParaInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 4)
        );
    }
    public static SceneTaskActionParaInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SceneTaskActionParaInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 4)
        );
    }
}
