// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SalonItemWearData(
    int itemWearId,
    int colorWearId
) {
    public static SalonItemWearData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SalonItemWearData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static SalonItemWearData parseFrom(java.util.List<ProtoField> fields) {
        return new SalonItemWearData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
