// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmSetBpExpReq(
    int uin,
    int exp
) {
    public static ZoneGmSetBpExpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSetBpExpReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGmSetBpExpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSetBpExpReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
