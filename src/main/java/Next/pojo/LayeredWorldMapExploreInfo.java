// Generated from com_world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record LayeredWorldMapExploreInfo(
    List<LayeredWorldMapExploreInfoOne> exploreInfos
) {
    public static LayeredWorldMapExploreInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LayeredWorldMapExploreInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.LayeredWorldMapExploreInfoOne::parseFrom).toList()
        );
    }
    public static LayeredWorldMapExploreInfo parseFrom(java.util.List<ProtoField> fields) {
        return new LayeredWorldMapExploreInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.LayeredWorldMapExploreInfoOne::parseFrom).toList()
        );
    }
}
