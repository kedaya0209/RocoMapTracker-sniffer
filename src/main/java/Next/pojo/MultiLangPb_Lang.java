// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MultiLangPb_Lang(
    int langType,
    String lang
) {
    public static MultiLangPb_Lang parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MultiLangPb_Lang(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static MultiLangPb_Lang parseFrom(java.util.List<ProtoField> fields) {
        return new MultiLangPb_Lang(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
