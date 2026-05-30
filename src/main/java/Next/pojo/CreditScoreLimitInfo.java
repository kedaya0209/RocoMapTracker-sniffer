// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CreditScoreLimitInfo(
    List<CreditScoreLimitInfo_SceneEntry> sceneEntryList
) {
    public static CreditScoreLimitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreditScoreLimitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CreditScoreLimitInfo_SceneEntry::parseFrom).toList()
        );
    }
    public static CreditScoreLimitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CreditScoreLimitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CreditScoreLimitInfo_SceneEntry::parseFrom).toList()
        );
    }
}
