// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_OwlRefugeInfoChange(
    int refugeCfgId,
    List<Integer> obtainedRewardIdxs
) {
    public static SpaceAct_OwlRefugeInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_OwlRefugeInfoChange(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static SpaceAct_OwlRefugeInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_OwlRefugeInfoChange(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
