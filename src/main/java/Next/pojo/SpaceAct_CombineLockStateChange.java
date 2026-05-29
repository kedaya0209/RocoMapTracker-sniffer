// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_CombineLockStateChange(
    long actorId,
    int unlockedNum,
    int totLockNum,
    List<CombineCondNpcInfo> condNpcInfos
) {
    public static SpaceAct_CombineLockStateChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CombineLockStateChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.CombineCondNpcInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_CombineLockStateChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CombineLockStateChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.CombineCondNpcInfo::parseFrom).toList()
        );
    }
}
