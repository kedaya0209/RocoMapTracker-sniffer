// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomePetRewardCache(
    int petGid,
    HomePetAwardInfo awardInfo
) {
    public static HomePetRewardCache parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetRewardCache(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.HomePetAwardInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static HomePetRewardCache parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetRewardCache(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.HomePetAwardInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
