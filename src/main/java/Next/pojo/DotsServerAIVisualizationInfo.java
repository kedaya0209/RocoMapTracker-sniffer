// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DotsServerAIVisualizationInfo(
    List<DotsServerAIInfo> aiList,
    List<DotsServerAIOwnerPlayerInfo> playerList,
    int totalAiCount,
    int totalRspNum,
    int curRspIndex
) {
    public static DotsServerAIVisualizationInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsServerAIVisualizationInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DotsServerAIInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsServerAIOwnerPlayerInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static DotsServerAIVisualizationInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DotsServerAIVisualizationInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DotsServerAIInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DotsServerAIOwnerPlayerInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
