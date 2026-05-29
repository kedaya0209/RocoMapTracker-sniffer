// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BagSellNode(
    int gid,
    int num
) {
    public static BagSellNode parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BagSellNode(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BagSellNode parseFrom(java.util.List<ProtoField> fields) {
        return new BagSellNode(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
