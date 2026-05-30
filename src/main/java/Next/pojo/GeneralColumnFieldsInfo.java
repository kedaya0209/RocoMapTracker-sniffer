// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GeneralColumnFieldsInfo(
    List<GeneralColumnFieldInfo> fieldInfoList
) {
    public static GeneralColumnFieldsInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GeneralColumnFieldsInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GeneralColumnFieldInfo::parseFrom).toList()
        );
    }
    public static GeneralColumnFieldsInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GeneralColumnFieldsInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GeneralColumnFieldInfo::parseFrom).toList()
        );
    }
}
