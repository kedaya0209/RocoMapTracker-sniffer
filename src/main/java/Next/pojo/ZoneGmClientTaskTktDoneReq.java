// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClientTaskTktDoneReq(
    int num
) {
    public static ZoneGmClientTaskTktDoneReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClientTaskTktDoneReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmClientTaskTktDoneReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClientTaskTktDoneReq(
            Pojos.readInt(fields, 1)
        );
    }
}
