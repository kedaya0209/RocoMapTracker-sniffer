// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneFriendInfo(
    int friendUin
) {
    public static SceneFriendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneFriendInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static SceneFriendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SceneFriendInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
