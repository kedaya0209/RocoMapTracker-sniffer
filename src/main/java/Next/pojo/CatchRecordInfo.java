// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CatchRecordInfo(
    List<HabitatCatchRecord> habitatCatchRecordDatas,
    List<EvolutionChainCatchRecord> evolutionChainCatchRecordDatas
) {
    public static CatchRecordInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CatchRecordInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HabitatCatchRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.EvolutionChainCatchRecord::parseFrom).toList()
        );
    }
    public static CatchRecordInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CatchRecordInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HabitatCatchRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.EvolutionChainCatchRecord::parseFrom).toList()
        );
    }
}
