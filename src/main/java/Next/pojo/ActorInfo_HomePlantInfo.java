// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_HomePlantInfo(
    CellInfo_HomePlantInfo cellHomePlantInfo,
    ActorPlantData actorPlantData
) {
    public static ActorInfo_HomePlantInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_HomePlantInfo(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CellInfo_HomePlantInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorPlantData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ActorInfo_HomePlantInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_HomePlantInfo(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CellInfo_HomePlantInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorPlantData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
