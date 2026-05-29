// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerMailFailInfo(
    List<MailFailInfo> mailFailInfoList
) {
    public static PlayerMailFailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerMailFailInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MailFailInfo::parseFrom).toList()
        );
    }
    public static PlayerMailFailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerMailFailInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MailFailInfo::parseFrom).toList()
        );
    }
}
