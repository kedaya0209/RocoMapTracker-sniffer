// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcGuard(
    List<NpcGuardData> guardData,
    int lastClearTime,
    List<Integer> banFuncList,
    long npcRefreshBanTime,
    int npcRefreshBanProbability
) {
    public static ActorCompData_NpcGuard parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcGuard(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcGuardData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ActorCompData_NpcGuard parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcGuard(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcGuardData::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
