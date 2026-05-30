// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSwitchClientToServerAiReq(
    List<Long> actorList,
    List<DotsComponentData> compDataList,
    List<Point> pointList
) {
    public static ZoneSwitchClientToServerAiReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSwitchClientToServerAiReq(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsComponentData::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Point::parseFrom).toList()
        );
    }
    public static ZoneSwitchClientToServerAiReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSwitchClientToServerAiReq(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsComponentData::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Point::parseFrom).toList()
        );
    }
}
