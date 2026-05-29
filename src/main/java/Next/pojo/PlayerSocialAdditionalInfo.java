// Generated from com_player_social_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSocialAdditionalInfo(
    int cliLoginChannel,
    PlayerStartUpPrivilegeInfo startUpPrivilegeInfo,
    PlayerSettingBriefInfo settingBriefInfo,
    PlayerDeletionInfo deletionInfo
) {
    public static PlayerSocialAdditionalInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSocialAdditionalInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSettingBriefInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerDeletionInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static PlayerSocialAdditionalInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSocialAdditionalInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerStartUpPrivilegeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSettingBriefInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerDeletionInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
