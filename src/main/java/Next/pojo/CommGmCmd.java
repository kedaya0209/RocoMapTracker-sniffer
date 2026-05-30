// Generated from com_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CommGmCmd(
    String cmdId,
    String cmdName,
    String cmdDesc,
    List<AutoParam> params,
    String cmdBelong
) {
    public static CommGmCmd parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CommGmCmd(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AutoParam::parseFrom).toList(),
            Pojos.readString(fields, 5)
        );
    }
    public static CommGmCmd parseFrom(java.util.List<ProtoField> fields) {
        return new CommGmCmd(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AutoParam::parseFrom).toList(),
            Pojos.readString(fields, 5)
        );
    }
}
