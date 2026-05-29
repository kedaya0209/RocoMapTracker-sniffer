// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePvpHisQueryRsp(
    RetInfo retInfo,
    List<PvpFightHis> his,
    int winCount,
    int loseCount
) {
    public static ZonePvpHisQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePvpHisQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PvpFightHis::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZonePvpHisQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePvpHisQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PvpFightHis::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
