// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CRDamageParam(
    int petId,
    int param
) {
    public static CRDamageParam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CRDamageParam(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static CRDamageParam parseFrom(java.util.List<ProtoField> fields) {
        return new CRDamageParam(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
