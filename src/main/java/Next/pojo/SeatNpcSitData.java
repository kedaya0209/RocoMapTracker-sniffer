// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SeatNpcSitData(
    long sitAvatarId
) {
    public static SeatNpcSitData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SeatNpcSitData(
            Pojos.readLong(fields, 2)
        );
    }
    public static SeatNpcSitData parseFrom(java.util.List<ProtoField> fields) {
        return new SeatNpcSitData(
            Pojos.readLong(fields, 2)
        );
    }
}
