// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneSeasonInfo(
    int seasonId,
    int seasonAdvShiningExtraWeight,
    int seasonAdvCatchProbAdd
) {
    public static SceneSeasonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneSeasonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SceneSeasonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SceneSeasonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
