// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OwlSanctuaryDetectInfo(
    boolean isDetected,
    List<VisitorOwlSanctuaryDetectInfo> visitorDetectInfo
) {
    public static OwlSanctuaryDetectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryDetectInfo(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.VisitorOwlSanctuaryDetectInfo::parseFrom).toList()
        );
    }
    public static OwlSanctuaryDetectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryDetectInfo(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.VisitorOwlSanctuaryDetectInfo::parseFrom).toList()
        );
    }
}
