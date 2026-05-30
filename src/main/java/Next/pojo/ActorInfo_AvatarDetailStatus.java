// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_AvatarDetailStatus(
    List<Integer> statusList,
    List<Integer> subStatusList,
    List<PlayerStatusCustomParams> avatarStatusParams,
    long endTransformTime
) {
    public static ActorInfo_AvatarDetailStatus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AvatarDetailStatus(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerStatusCustomParams::parseFrom).toList(),
            Pojos.readLong(fields, 4)
        );
    }
    public static ActorInfo_AvatarDetailStatus parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AvatarDetailStatus(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerStatusCustomParams::parseFrom).toList(),
            Pojos.readLong(fields, 4)
        );
    }
}
