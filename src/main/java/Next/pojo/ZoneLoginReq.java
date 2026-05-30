// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneLoginReq(
    byte[] openid,
    PlatInfo platInfo,
    ClientInfo cliInfo,
    boolean isLogin,
    boolean leavingOnlineVisiting,
    int quality
) {
    public static ZoneLoginReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneLoginReq(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlatInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneLoginReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneLoginReq(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlatInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
