// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRegisterReq(
    byte[] openid,
    PlatInfo platInfo,
    ClientInfo cliInfo,
    byte[] name,
    String cdkey,
    String label
) {
    public static ZoneRegisterReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRegisterReq(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlatInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBytes(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
    public static ZoneRegisterReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRegisterReq(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlatInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBytes(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
}
