// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneDungeonInfoQueryRsp_CollectionInfo(
    int collecttionType,
    int collectionNum
) {
    public static ZoneSceneDungeonInfoQueryRsp_CollectionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneDungeonInfoQueryRsp_CollectionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneDungeonInfoQueryRsp_CollectionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneDungeonInfoQueryRsp_CollectionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
