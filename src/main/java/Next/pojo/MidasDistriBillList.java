// Generated from com_recharge.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MidasDistriBillList(
    List<MidasDistriBillInfo> billnos
) {
    public static MidasDistriBillList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasDistriBillList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MidasDistriBillInfo::parseFrom).toList()
        );
    }
    public static MidasDistriBillList parseFrom(java.util.List<ProtoField> fields) {
        return new MidasDistriBillList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MidasDistriBillInfo::parseFrom).toList()
        );
    }
}
