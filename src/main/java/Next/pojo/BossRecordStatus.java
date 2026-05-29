// Generated from com_handbook.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BossRecordStatus(
    int bossBaseId,
    int status
) {
    public static BossRecordStatus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BossRecordStatus(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BossRecordStatus parseFrom(java.util.List<ProtoField> fields) {
        return new BossRecordStatus(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
