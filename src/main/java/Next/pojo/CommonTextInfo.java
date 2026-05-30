// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CommonTextInfo(
    String textId,
    List<CommonTextInfoArgs> args
) {
    public static CommonTextInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CommonTextInfo(
            Pojos.readString(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CommonTextInfoArgs::parseFrom).toList()
        );
    }
    public static CommonTextInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CommonTextInfo(
            Pojos.readString(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CommonTextInfoArgs::parseFrom).toList()
        );
    }
}
