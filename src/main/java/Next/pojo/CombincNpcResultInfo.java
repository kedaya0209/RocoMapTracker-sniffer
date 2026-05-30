// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CombincNpcResultInfo(
    boolean isCompleted,
    boolean npcGuide,
    int resultType,
    int contentPoint,
    int guideType,
    boolean lockGuide
) {
    public static CombincNpcResultInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CombincNpcResultInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static CombincNpcResultInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CombincNpcResultInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
