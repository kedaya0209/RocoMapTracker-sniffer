// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActionBonusPityInfo(
    List<ActionBonusPityAccu> pityAccus,
    List<BonusPityRecord> bonusPityRecords
) {
    public static ActionBonusPityInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusPityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActionBonusPityAccu::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BonusPityRecord::parseFrom).toList()
        );
    }
    public static ActionBonusPityInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusPityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActionBonusPityAccu::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BonusPityRecord::parseFrom).toList()
        );
    }
}
