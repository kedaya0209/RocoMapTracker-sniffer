// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NavFindPathInfo(
    List<Position> pos
) {
    public static NavFindPathInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NavFindPathInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
    public static NavFindPathInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NavFindPathInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
}
