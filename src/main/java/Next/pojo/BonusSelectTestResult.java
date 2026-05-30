// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BonusSelectTestResult(
    int runTimes,
    List<Integer> pendingList,
    List<BonusSelectInfo> selectResult
) {
    public static BonusSelectTestResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BonusSelectTestResult(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BonusSelectInfo::parseFrom).toList()
        );
    }
    public static BonusSelectTestResult parseFrom(java.util.List<ProtoField> fields) {
        return new BonusSelectTestResult(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BonusSelectInfo::parseFrom).toList()
        );
    }
}
