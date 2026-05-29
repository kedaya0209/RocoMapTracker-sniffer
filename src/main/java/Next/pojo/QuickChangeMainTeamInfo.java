// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record QuickChangeMainTeamInfo(
    int mainTeamIdx,
    int teamType
) {
    public static QuickChangeMainTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new QuickChangeMainTeamInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static QuickChangeMainTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new QuickChangeMainTeamInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
