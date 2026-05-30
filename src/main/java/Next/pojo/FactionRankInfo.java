// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FactionRankInfo(
    List<FactionRankInfo_RankInfo> rankList
) {
    public static FactionRankInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FactionRankInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FactionRankInfo_RankInfo::parseFrom).toList()
        );
    }
    public static FactionRankInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FactionRankInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FactionRankInfo_RankInfo::parseFrom).toList()
        );
    }
}
