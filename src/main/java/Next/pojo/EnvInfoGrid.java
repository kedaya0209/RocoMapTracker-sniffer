// Generated from env_info.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record EnvInfoGrid(
    List<EnvInfoCell> cellList
) {
    public static EnvInfoGrid parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EnvInfoGrid(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.EnvInfoCell::parseFrom).toList()
        );
    }
    public static EnvInfoGrid parseFrom(java.util.List<ProtoField> fields) {
        return new EnvInfoGrid(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.EnvInfoCell::parseFrom).toList()
        );
    }
}
