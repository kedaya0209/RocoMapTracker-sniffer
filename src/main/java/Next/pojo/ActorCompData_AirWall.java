// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_AirWall(
    AirWallInfo airWallInfo
) {
    public static ActorCompData_AirWall parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_AirWall(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.AirWallInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorCompData_AirWall parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_AirWall(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.AirWallInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
