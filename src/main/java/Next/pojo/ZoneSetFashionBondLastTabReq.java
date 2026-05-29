// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetFashionBondLastTabReq(
    int lastFashionbondTab
) {
    public static ZoneSetFashionBondLastTabReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetFashionBondLastTabReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSetFashionBondLastTabReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetFashionBondLastTabReq(
            Pojos.readInt(fields, 1)
        );
    }
}
