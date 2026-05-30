// Generated from com_goods.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BagItemMaskList(
    int type,
    List<Integer> id
) {
    public static BagItemMaskList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BagItemMaskList(
            Pojos.readInt(fields, 1, 0),
            Pojos.readIntList(fields, 2)
        );
    }
    public static BagItemMaskList parseFrom(java.util.List<ProtoField> fields) {
        return new BagItemMaskList(
            Pojos.readInt(fields, 1, 0),
            Pojos.readIntList(fields, 2)
        );
    }
}
