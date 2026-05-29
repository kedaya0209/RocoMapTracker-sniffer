// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneAckReceiveDungeonFinishReq(
    int dungeonCfgId,
    List<Integer> stageCfgIds
) {
    public static ZoneAckReceiveDungeonFinishReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneAckReceiveDungeonFinishReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneAckReceiveDungeonFinishReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneAckReceiveDungeonFinishReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
