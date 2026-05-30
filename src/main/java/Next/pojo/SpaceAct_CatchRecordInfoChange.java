// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_CatchRecordInfoChange(
    long actorId,
    CatchRecordInfo catchRecordDatas,
    List<Integer> delHabitatIds,
    List<Integer> delEvolutionChainIds
) {
    public static SpaceAct_CatchRecordInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CatchRecordInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CatchRecordInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
    public static SpaceAct_CatchRecordInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CatchRecordInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CatchRecordInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
}
