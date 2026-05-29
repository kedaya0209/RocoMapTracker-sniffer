// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePetPowerDashInteractReq(
    int gid,
    long npcActorId,
    int optionId,
    SceneBasePetData petData
) {
    public static ZoneScenePetPowerDashInteractReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePetPowerDashInteractReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SceneBasePetData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneScenePetPowerDashInteractReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePetPowerDashInteractReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SceneBasePetData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
