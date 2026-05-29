// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_ActorPlantDataUpdate(
    ActorPlantData actorPlantData
) {
    public static SpaceAct_ActorPlantDataUpdate parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ActorPlantDataUpdate(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorPlantData.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static SpaceAct_ActorPlantDataUpdate parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ActorPlantDataUpdate(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorPlantData.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
