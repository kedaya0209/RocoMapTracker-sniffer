// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneClientInitAoiIncrUpdateNty(
    int batchId,
    int totalBatch,
    List<ActorInfo> otherActors
) {
    public static ZoneSceneClientInitAoiIncrUpdateNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneClientInitAoiIncrUpdateNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneClientInitAoiIncrUpdateNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneClientInitAoiIncrUpdateNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo::parseFrom).toList()
        );
    }
}
