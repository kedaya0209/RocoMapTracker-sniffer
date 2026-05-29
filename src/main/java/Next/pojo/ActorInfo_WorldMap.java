// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_WorldMap(
    boolean sendInBatches,
    int totalEntryBatches,
    WorldMapEntries entries,
    List<Integer> unlockedWorldMapBlockCfgIds,
    Point mainScenePt,
    LayeredWorldMapExploreInfo layeredWorldMapExploreInfo,
    List<Integer> mainScenePtEffectAreas,
    List<WorldMapAutoTrackNpcInfo> autoTrackNpcInfos
) {
    public static ActorInfo_WorldMap parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_WorldMap(
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 1) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.LayeredWorldMapExploreInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readIntList(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.WorldMapAutoTrackNpcInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_WorldMap parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_WorldMap(
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 1) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.LayeredWorldMapExploreInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readIntList(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.WorldMapAutoTrackNpcInfo::parseFrom).toList()
        );
    }
}
