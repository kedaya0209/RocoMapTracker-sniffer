// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityInviteRegisterData(
    List<InviteeInfo> inviteeList
) {
    public static PlayerActivityInfo_ActivityInviteRegisterData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityInviteRegisterData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.InviteeInfo::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityInviteRegisterData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityInviteRegisterData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.InviteeInfo::parseFrom).toList()
        );
    }
}
