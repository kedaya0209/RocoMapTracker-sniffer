// Generated from home_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorPlantData(
    int stealCnt
) {
    public static ActorPlantData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPlantData(
            Pojos.readInt(fields, 1)
        );
    }
    public static ActorPlantData parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPlantData(
            Pojos.readInt(fields, 1)
        );
    }
}
