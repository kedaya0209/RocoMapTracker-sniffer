// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneNpcTraceQueryReq(
    List<Integer> npcCfgId,
    boolean cancelTrace,
    List<Integer> petBaseId
) {
    public static ZoneNpcTraceQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNpcTraceQueryReq(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneNpcTraceQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNpcTraceQueryReq(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
