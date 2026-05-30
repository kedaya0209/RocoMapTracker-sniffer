// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerMageBookInfo(
    List<MageNpcInfo> npcs,
    List<Integer> delayedNpcs,
    List<Integer> delayedItems,
    List<Integer> helperNpcs,
    List<MageNpcAssignInfo> helperAssign,
    boolean enabled,
    int npcRefreshTime,
    int helperAssignTime,
    List<MageNpcCampInfo> campInfo,
    List<MageCampAssignInfo> campAssign
) {
    public static PlayerMageBookInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerMageBookInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MageNpcInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.MageNpcAssignInfo::parseFrom).toList(),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.MageNpcCampInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.MageCampAssignInfo::parseFrom).toList()
        );
    }
    public static PlayerMageBookInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerMageBookInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MageNpcInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.MageNpcAssignInfo::parseFrom).toList(),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.MageNpcCampInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.MageCampAssignInfo::parseFrom).toList()
        );
    }
}
