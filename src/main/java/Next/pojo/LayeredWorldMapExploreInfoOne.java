// Generated from com_world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LayeredWorldMapExploreInfoOne(
    int npcId,
    int belongCamp,
    int exploreNum,
    int totalNum
) {
    public static LayeredWorldMapExploreInfoOne parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LayeredWorldMapExploreInfoOne(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static LayeredWorldMapExploreInfoOne parseFrom(java.util.List<ProtoField> fields) {
        return new LayeredWorldMapExploreInfoOne(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
