// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCardBriefInfo_AppearanceInfo(
    List<Integer> fashionWearId,
    int poseSelected,
    int poseFrameId,
    int cardSkinSelected,
    List<SalonItemWearData> salonItemData
) {
    public static PlayerCardBriefInfo_AppearanceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardBriefInfo_AppearanceInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
    public static PlayerCardBriefInfo_AppearanceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardBriefInfo_AppearanceInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
}
