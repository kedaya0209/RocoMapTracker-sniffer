// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneOpSeatRsp(
    RetInfo retInfo,
    int opType,
    int seatIdx,
    int leavePointIdx
) {
    public static ZoneSceneOpSeatRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneOpSeatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneSceneOpSeatRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneOpSeatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
