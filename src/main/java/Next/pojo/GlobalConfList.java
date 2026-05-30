// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GlobalConfList(
    List<GlobalConfInfo> globalList
) {
    public static GlobalConfList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GlobalConfList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GlobalConfInfo::parseFrom).toList()
        );
    }
    public static GlobalConfList parseFrom(java.util.List<ProtoField> fields) {
        return new GlobalConfList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GlobalConfInfo::parseFrom).toList()
        );
    }
}
