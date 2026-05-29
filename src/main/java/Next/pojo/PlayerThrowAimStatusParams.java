// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerThrowAimStatusParams(
    int aimType,
    int throwItemType,
    int throwBallId,
    boolean isFast,
    boolean isThrowSuccess,
    int throwSessionId,
    Position throwVelocity,
    int chargedLevel,
    Position aimRotation,
    Position throwStartPos,
    int magicConfId,
    boolean isMagicCancel
) {
    public static PlayerThrowAimStatusParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerThrowAimStatusParams(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
    public static PlayerThrowAimStatusParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerThrowAimStatusParams(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
}
