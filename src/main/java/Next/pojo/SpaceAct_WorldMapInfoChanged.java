// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldMapInfoChanged(
    long actorId,
    WorldMapEntries changedEntries,
    int unlockedWorldMapBlockCfgId,
    LayeredWorldMapExploreInfoOne changedLayeredExploreInfo,
    long delAutoTrackNpcLogicId
) {
    public static SpaceAct_WorldMapInfoChanged parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldMapInfoChanged(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.LayeredWorldMapExploreInfoOne.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 5)
        );
    }
    public static SpaceAct_WorldMapInfoChanged parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldMapInfoChanged(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.LayeredWorldMapExploreInfoOne.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 5)
        );
    }
}
