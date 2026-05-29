// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_CancelServerAttach(
    long actorId,
    Point cancelPoint,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo
) {
    public static SpaceAct_CancelServerAttach parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CancelServerAttach(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static SpaceAct_CancelServerAttach parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CancelServerAttach(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
