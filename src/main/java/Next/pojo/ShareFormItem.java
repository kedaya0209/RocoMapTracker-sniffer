// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ShareFormItem(
    int id
) {
    public static ShareFormItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ShareFormItem(
            Pojos.readInt(fields, 1)
        );
    }
    public static ShareFormItem parseFrom(java.util.List<ProtoField> fields) {
        return new ShareFormItem(
            Pojos.readInt(fields, 1)
        );
    }
}
