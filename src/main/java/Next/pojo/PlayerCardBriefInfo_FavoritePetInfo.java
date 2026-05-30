// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCardBriefInfo_FavoritePetInfo(
    int skillDamType,
    int petBaseId,
    int lastShownTimestamp,
    int mutationDiffType
) {
    public static PlayerCardBriefInfo_FavoritePetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardBriefInfo_FavoritePetInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static PlayerCardBriefInfo_FavoritePetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardBriefInfo_FavoritePetInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
