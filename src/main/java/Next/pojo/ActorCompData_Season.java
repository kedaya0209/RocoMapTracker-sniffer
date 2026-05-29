// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_Season(
    int seasonId,
    int bossRefreshContentId,
    int seasonPveId,
    boolean bossIsRefresh,
    int seasonAdvShiningExtraWeight,
    int seasonAdvCatchProbAdd,
    int seasonBossId
) {
    public static ActorCompData_Season parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Season(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static ActorCompData_Season parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Season(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
