// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientInfo(
    ClientVerInfo verInfo,
    ClientDevInfo devInfo,
    ClientTokenInfo tokenInfo,
    ClientExtInfo extInfo
) {
    public static ClientInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClientVerInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ClientDevInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientTokenInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ClientExtInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ClientInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ClientInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClientVerInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ClientDevInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientTokenInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ClientExtInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
