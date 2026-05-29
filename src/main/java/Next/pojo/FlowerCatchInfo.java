// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FlowerCatchInfo(
    int petGid
) {
    public static FlowerCatchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FlowerCatchInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static FlowerCatchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FlowerCatchInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
