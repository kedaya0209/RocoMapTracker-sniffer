// Generated from com_relation.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InteractParam(
    int actionId,
    boolean isLock,
    int pickedEggGid,
    int pickedBagitemConfId,
    int pickedPetGid,
    long pickedPetNpcId
) {
    public static InteractParam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InteractParam(
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
    public static InteractParam parseFrom(java.util.List<ProtoField> fields) {
        return new InteractParam(
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
}
