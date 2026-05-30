// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcOptionExtraData(
    List<SubmitItemFreeList> submitItemFreeList,
    int battleDifficultyId,
    int battleCfgId
) {
    public static NpcOptionExtraData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcOptionExtraData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SubmitItemFreeList::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static NpcOptionExtraData parseFrom(java.util.List<ProtoField> fields) {
        return new NpcOptionExtraData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SubmitItemFreeList::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
