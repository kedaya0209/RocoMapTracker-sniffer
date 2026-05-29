// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CreditScoreLimitInfo_SceneEntry(
    String sceneId,
    List<CreditScoreLimitInfo_GroupEntry> groupEntryList
) {
    public static CreditScoreLimitInfo_SceneEntry parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreditScoreLimitInfo_SceneEntry(
            Pojos.readString(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CreditScoreLimitInfo_GroupEntry::parseFrom).toList()
        );
    }
    public static CreditScoreLimitInfo_SceneEntry parseFrom(java.util.List<ProtoField> fields) {
        return new CreditScoreLimitInfo_SceneEntry(
            Pojos.readString(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CreditScoreLimitInfo_GroupEntry::parseFrom).toList()
        );
    }
}
