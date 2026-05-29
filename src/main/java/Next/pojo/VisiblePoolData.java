// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisiblePoolData(
    List<AvatarVisibility> visibleList,
    long poolId
) {
    public static VisiblePoolData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisiblePoolData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AvatarVisibility::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
    public static VisiblePoolData parseFrom(java.util.List<ProtoField> fields) {
        return new VisiblePoolData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AvatarVisibility::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
}
