// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OpenIdList(
    List<byte[]> openid
) {
    public static OpenIdList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OpenIdList(
            Pojos.readBytesList(fields, 1)
        );
    }
    public static OpenIdList parseFrom(java.util.List<ProtoField> fields) {
        return new OpenIdList(
            Pojos.readBytesList(fields, 1)
        );
    }
}
