// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AimSyncInfo(
    int aimType,
    AimThrowInfo throwInfo,
    boolean isThrowSuccess,
    Position throwVelocity,
    AimMagicInfo magicInfo
) {
    public static AimSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AimSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AimThrowInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.AimMagicInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static AimSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AimSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AimThrowInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.AimMagicInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
