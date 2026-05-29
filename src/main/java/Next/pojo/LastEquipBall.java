// Generated from client.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LastEquipBall(
    long EquipBallId
) {
    public static LastEquipBall parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LastEquipBall(
            Pojos.readLong(fields, 1)
        );
    }
    public static LastEquipBall parseFrom(java.util.List<ProtoField> fields) {
        return new LastEquipBall(
            Pojos.readLong(fields, 1)
        );
    }
}
