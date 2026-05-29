// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record VisitorOwlSanctuaryDetectInfo(
    int uin,
    boolean isDetected
) {
    public static VisitorOwlSanctuaryDetectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisitorOwlSanctuaryDetectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static VisitorOwlSanctuaryDetectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new VisitorOwlSanctuaryDetectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
