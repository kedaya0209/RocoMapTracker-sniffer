// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_AISeqIdNotify(
    List<Long> actorIdList,
    List<Integer> aiSedList
) {
    public static SpaceAct_AISeqIdNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AISeqIdNotify(
            Pojos.readLongList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static SpaceAct_AISeqIdNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AISeqIdNotify(
            Pojos.readLongList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
