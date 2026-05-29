// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomePlantPlantCrop(
    long actorId,
    int landId,
    int seedId
) {
    public static SpaceAct_HomePlantPlantCrop parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomePlantPlantCrop(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SpaceAct_HomePlantPlantCrop parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomePlantPlantCrop(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
