// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmSwitchClientAiToServerReq(
    List<Long> actorList,
    List<DotsComponentData> compDataList,
    List<Point> pointList,
    boolean isBatchSwitch
) {
    public static ZoneGmSwitchClientAiToServerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSwitchClientAiToServerReq(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsComponentData::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Point::parseFrom).toList(),
            Pojos.readBool(fields, 4)
        );
    }
    public static ZoneGmSwitchClientAiToServerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSwitchClientAiToServerReq(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsComponentData::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.Point::parseFrom).toList(),
            Pojos.readBool(fields, 4)
        );
    }
}
