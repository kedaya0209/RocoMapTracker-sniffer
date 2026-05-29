// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBattlePassBriefInfo(
    int giftGrade
) {
    public static PlayerBattlePassBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattlePassBriefInfo(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static PlayerBattlePassBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattlePassBriefInfo(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
