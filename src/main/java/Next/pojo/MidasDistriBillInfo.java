// Generated from com_recharge.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MidasDistriBillInfo(
    byte[] billno,
    int updateTime
) {
    public static MidasDistriBillInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasDistriBillInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static MidasDistriBillInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MidasDistriBillInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
