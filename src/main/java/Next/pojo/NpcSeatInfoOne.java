// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NpcSeatInfoOne(
    int seatIdx,
    long interactAvatarId
) {
    public static NpcSeatInfoOne parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcSeatInfoOne(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static NpcSeatInfoOne parseFrom(java.util.List<ProtoField> fields) {
        return new NpcSeatInfoOne(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
