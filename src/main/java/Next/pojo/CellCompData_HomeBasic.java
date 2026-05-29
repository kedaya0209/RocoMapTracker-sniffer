// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellCompData_HomeBasic(
    byte[] homeName,
    int homeExperience,
    int homeLevel,
    int roomLevel,
    int homeComfortLevel,
    int homeStatus,
    HomeAccessInfo accessInfo,
    List<HomeVisitorInfo> visitorInfoList,
    RoomLayoutInfo roomLayout,
    RoomExpansionInfo roomExpansionInfo,
    HomeVisitHistoryInfo visitHistory,
    HomeRareLayEggBanInfo rareLayEggBanInfo
) {
    public static CellCompData_HomeBasic parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellCompData_HomeBasic(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7, 0),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.HomeAccessInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.HomeVisitorInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 20) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.HomeVisitHistoryInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.HomeRareLayEggBanInfo.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
    public static CellCompData_HomeBasic parseFrom(java.util.List<ProtoField> fields) {
        return new CellCompData_HomeBasic(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7, 0),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.HomeAccessInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.HomeVisitorInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 20) != null ? Next.pojo.RoomLayoutInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.HomeVisitHistoryInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.HomeRareLayEggBanInfo.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
}
