// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcPendantInfo(
    int pendantCfgId,
    boolean enabled,
    long disableTime,
    List<NpcPendantItemInfo> pendantItemInfos,
    int validTimes
) {
    public static NpcPendantInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcPendantInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.NpcPendantItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
    public static NpcPendantInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NpcPendantInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.NpcPendantItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
}
