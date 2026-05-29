// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GamePlayerDiagnosisList(
    List<GamePlayerDiagnosisInfo> diagnosisList
) {
    public static GamePlayerDiagnosisList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GamePlayerDiagnosisList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GamePlayerDiagnosisInfo::parseFrom).toList()
        );
    }
    public static GamePlayerDiagnosisList parseFrom(java.util.List<ProtoField> fields) {
        return new GamePlayerDiagnosisList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GamePlayerDiagnosisInfo::parseFrom).toList()
        );
    }
}
