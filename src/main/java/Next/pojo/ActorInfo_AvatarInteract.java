// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_AvatarInteract(
    long interactNpcId,
    AvatarSitInfo sitInfo
) {
    public static ActorInfo_AvatarInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AvatarInteract(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AvatarSitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ActorInfo_AvatarInteract parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AvatarInteract(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AvatarSitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
