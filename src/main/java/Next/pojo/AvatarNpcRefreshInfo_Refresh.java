// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AvatarNpcRefreshInfo_Refresh(
    int refreshCfgId,
    boolean markDelete,
    int lastNpcDataResetTime,
    boolean initContent,
    int lastRandResetTime,
    int contentOrder,
    int wave,
    int lastWaveTime,
    List<Integer> refreshedSceneCfgIds,
    int allDeleteTime,
    List<GeneratedContent> generatedContents,
    List<WaitGenerateContentData> waitGenerateContents,
    List<Integer> resetContents,
    List<FlowerSeedBossData> flowerSeedBossDatas,
    List<ExhaustedContentData> exhaustedContents,
    List<Integer> openedContentIds
) {
    public static AvatarNpcRefreshInfo_Refresh parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarNpcRefreshInfo_Refresh(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.GeneratedContent::parseFrom).toList(),
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.WaitGenerateContentData::parseFrom).toList(),
            Pojos.readIntList(fields, 15),
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.FlowerSeedBossData::parseFrom).toList(),
            Pojos.readMessageList(fields, 18).stream().map(Next.pojo.ExhaustedContentData::parseFrom).toList(),
            Pojos.readIntList(fields, 19)
        );
    }
    public static AvatarNpcRefreshInfo_Refresh parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarNpcRefreshInfo_Refresh(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.GeneratedContent::parseFrom).toList(),
            Pojos.readMessageList(fields, 14).stream().map(Next.pojo.WaitGenerateContentData::parseFrom).toList(),
            Pojos.readIntList(fields, 15),
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.FlowerSeedBossData::parseFrom).toList(),
            Pojos.readMessageList(fields, 18).stream().map(Next.pojo.ExhaustedContentData::parseFrom).toList(),
            Pojos.readIntList(fields, 19)
        );
    }
}
