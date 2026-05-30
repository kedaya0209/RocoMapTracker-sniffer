// Generated from world_map.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGmMapMarkOperateRsp(
    RetInfo retInfo,
    List<WorldMapEntry_Mark> markEntry
) {
    public static ZoneSceneGmMapMarkOperateRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGmMapMarkOperateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapEntry_Mark::parseFrom).toList()
        );
    }
    public static ZoneSceneGmMapMarkOperateRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGmMapMarkOperateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldMapEntry_Mark::parseFrom).toList()
        );
    }
}
