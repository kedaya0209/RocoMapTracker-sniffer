// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffRunningData(
    List<BuffbaseRunningData> data
) {
    public static BuffRunningData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffRunningData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffbaseRunningData::parseFrom).toList()
        );
    }
    public static BuffRunningData parseFrom(java.util.List<ProtoField> fields) {
        return new BuffRunningData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffbaseRunningData::parseFrom).toList()
        );
    }
}
