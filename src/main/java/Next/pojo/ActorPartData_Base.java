// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorPartData_Base(
    long id,
    long logicId,
    int bornTime,
    int enterSceneTimes,
    String name,
    int gender,
    long cellId,
    Position bornPos,
    int bornDir,
    int bornDirX,
    int bornDirY,
    Position pos,
    int dir,
    int dirX,
    int dirY
) {
    public static ActorPartData_Base parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPartData_Base(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readString(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 51),
            Pojos.readMessage(fields, 52) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 52)) : null,
            Pojos.readInt(fields, 53),
            Pojos.readInt(fields, 56),
            Pojos.readInt(fields, 57),
            Pojos.readMessage(fields, 54) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 54)) : null,
            Pojos.readInt(fields, 55),
            Pojos.readInt(fields, 58),
            Pojos.readInt(fields, 59)
        );
    }
    public static ActorPartData_Base parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPartData_Base(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readString(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 51),
            Pojos.readMessage(fields, 52) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 52)) : null,
            Pojos.readInt(fields, 53),
            Pojos.readInt(fields, 56),
            Pojos.readInt(fields, 57),
            Pojos.readMessage(fields, 54) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 54)) : null,
            Pojos.readInt(fields, 55),
            Pojos.readInt(fields, 58),
            Pojos.readInt(fields, 59)
        );
    }
}
