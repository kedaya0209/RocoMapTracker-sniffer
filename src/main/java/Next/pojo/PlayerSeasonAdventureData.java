// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerSeasonAdventureData(
    SeasonAdventure curSeason,
    List<DumpSeasonAdventure> dumpSeasonList
) {
    public static PlayerSeasonAdventureData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSeasonAdventureData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SeasonAdventure.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DumpSeasonAdventure::parseFrom).toList()
        );
    }
    public static PlayerSeasonAdventureData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSeasonAdventureData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SeasonAdventure.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DumpSeasonAdventure::parseFrom).toList()
        );
    }
}
