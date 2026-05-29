// Generated from env_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record EnvInfoTile(
    int x,
    int y,
    List<EnvInfoGrid> gridList
) {
    public static EnvInfoTile parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EnvInfoTile(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.EnvInfoGrid::parseFrom).toList()
        );
    }
    public static EnvInfoTile parseFrom(java.util.List<ProtoField> fields) {
        return new EnvInfoTile(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.EnvInfoGrid::parseFrom).toList()
        );
    }
}
