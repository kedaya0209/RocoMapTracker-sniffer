// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PedalData(
    int petGid,
    long petNpcId,
    long avatarId,
    int optionId
) {
    public static PedalData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PedalData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static PedalData parseFrom(java.util.List<ProtoField> fields) {
        return new PedalData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
