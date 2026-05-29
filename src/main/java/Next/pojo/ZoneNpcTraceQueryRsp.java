// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneNpcTraceQueryRsp(
    RetInfo retInfo,
    NpcTraceInfo npcTraceInfo,
    List<Integer> petBaseId
) {
    public static ZoneNpcTraceQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNpcTraceQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NpcTraceInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneNpcTraceQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNpcTraceQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NpcTraceInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
}
