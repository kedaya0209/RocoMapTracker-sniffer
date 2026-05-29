// Generated from com_magebook.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MageNpcCampInfo(
    int id,
    boolean taskFinish,
    boolean disabled
) {
    public static MageNpcCampInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MageNpcCampInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static MageNpcCampInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MageNpcCampInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
