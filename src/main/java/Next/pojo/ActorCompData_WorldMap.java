// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_WorldMap(
    List<WorldMapEntry_Area> areaInfos,
    List<Integer> unlockedWorldMapBlockCfgIds,
    List<WorldMapEntry_Mark> normalMarkInfos,
    List<WorldMapEntry_Mark> petMarkInfos,
    int nextMarkId,
    Point mainScenePt,
    boolean syncing,
    int syncEntryTypes,
    String gamecfgVer,
    LayeredWorldMapExploreInfo layeredWorldMapExploreInfo,
    List<WorldMapAutoTrackNpcInfo> autoTrackNpcInfos
) {
    public static ActorCompData_WorldMap parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_WorldMap(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapEntry_Area::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.WorldMapEntry_Mark::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.WorldMapEntry_Mark::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readString(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.LayeredWorldMapExploreInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessageList(fields, 15).stream().map(Next.pojo.WorldMapAutoTrackNpcInfo::parseFrom).toList()
        );
    }
    public static ActorCompData_WorldMap parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_WorldMap(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapEntry_Area::parseFrom).toList(),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.WorldMapEntry_Mark::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.WorldMapEntry_Mark::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readString(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.LayeredWorldMapExploreInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessageList(fields, 15).stream().map(Next.pojo.WorldMapAutoTrackNpcInfo::parseFrom).toList()
        );
    }
}
