// Generated from env_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record EnvInfo(
    List<EnvInfoTile> tileList
) {
    public static EnvInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EnvInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.EnvInfoTile::parseFrom).toList()
        );
    }
    public static EnvInfo parseFrom(java.util.List<ProtoField> fields) {
        return new EnvInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.EnvInfoTile::parseFrom).toList()
        );
    }
}
