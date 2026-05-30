// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSwitchServerToClientAiNty(
    List<Long> actorList,
    List<DotsComponentData> compDataList
) {
    public static ZoneSwitchServerToClientAiNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSwitchServerToClientAiNty(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsComponentData::parseFrom).toList()
        );
    }
    public static ZoneSwitchServerToClientAiNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSwitchServerToClientAiNty(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsComponentData::parseFrom).toList()
        );
    }
}
