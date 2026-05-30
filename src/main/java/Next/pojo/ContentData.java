// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ContentData(
    int contentCfgId,
    long blockId,
    ContentMetaData metaData,
    List<ActorData_Npc> npcDatas
) {
    public static ContentData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ContentData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ContentMetaData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ActorData_Npc::parseFrom).toList()
        );
    }
    public static ContentData parseFrom(java.util.List<ProtoField> fields) {
        return new ContentData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ContentMetaData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ActorData_Npc::parseFrom).toList()
        );
    }
}
