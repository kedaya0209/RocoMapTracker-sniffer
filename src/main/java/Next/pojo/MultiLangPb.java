// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MultiLangPb(
    List<MultiLangPb_Lang> langs
) {
    public static MultiLangPb parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MultiLangPb(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MultiLangPb_Lang::parseFrom).toList()
        );
    }
    public static MultiLangPb parseFrom(java.util.List<ProtoField> fields) {
        return new MultiLangPb(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MultiLangPb_Lang::parseFrom).toList()
        );
    }
}
