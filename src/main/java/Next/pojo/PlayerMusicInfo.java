// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerMusicInfo(
    List<Integer> musicIdList,
    List<MusicApplyInfo> applyList
) {
    public static PlayerMusicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerMusicInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MusicApplyInfo::parseFrom).toList()
        );
    }
    public static PlayerMusicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerMusicInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MusicApplyInfo::parseFrom).toList()
        );
    }
}
