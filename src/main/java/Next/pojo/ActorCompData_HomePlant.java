// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_HomePlant(
    long resetTimestamp,
    ActorPlantData actorPlantData
) {
    public static ActorCompData_HomePlant parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_HomePlant(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorPlantData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ActorCompData_HomePlant parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_HomePlant(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorPlantData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
