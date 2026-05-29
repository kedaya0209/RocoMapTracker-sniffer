// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellCompData_NpcRefresher(
    List<ActorData_Npc> homeNpcDatas,
    int npcIncId,
    List<NpcRefreshControllerData> refreshControllers,
    List<Integer> idelNpcIncId
) {
    public static CellCompData_NpcRefresher parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellCompData_NpcRefresher(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorData_Npc::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.NpcRefreshControllerData::parseFrom).toList(),
            Pojos.readIntList(fields, 4)
        );
    }
    public static CellCompData_NpcRefresher parseFrom(java.util.List<ProtoField> fields) {
        return new CellCompData_NpcRefresher(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorData_Npc::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.NpcRefreshControllerData::parseFrom).toList(),
            Pojos.readIntList(fields, 4)
        );
    }
}
