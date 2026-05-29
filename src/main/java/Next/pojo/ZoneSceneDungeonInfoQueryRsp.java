// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneDungeonInfoQueryRsp(
    RetInfo retInfo,
    int dungeonState,
    List<ZoneSceneDungeonInfoQueryRsp_CollectionInfo> collections
) {
    public static ZoneSceneDungeonInfoQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneDungeonInfoQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneSceneDungeonInfoQueryRsp_CollectionInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneDungeonInfoQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneDungeonInfoQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneSceneDungeonInfoQueryRsp_CollectionInfo::parseFrom).toList()
        );
    }
}
