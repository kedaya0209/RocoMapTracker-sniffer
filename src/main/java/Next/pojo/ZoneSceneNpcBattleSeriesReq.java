// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneNpcBattleSeriesReq(
    List<Long> npcIdList
) {
    public static ZoneSceneNpcBattleSeriesReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNpcBattleSeriesReq(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneSceneNpcBattleSeriesReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNpcBattleSeriesReq(
            Pojos.readLongList(fields, 1)
        );
    }
}
