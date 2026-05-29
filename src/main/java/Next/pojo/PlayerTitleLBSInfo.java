// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerTitleLBSInfo(
    int province,
    int rank
) {
    public static PlayerTitleLBSInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTitleLBSInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerTitleLBSInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTitleLBSInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
