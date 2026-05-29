// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Handbook(
    List<HandbookRecord> handbookRecords
) {
    public static ActorInfo_Handbook parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Handbook(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HandbookRecord::parseFrom).toList()
        );
    }
    public static ActorInfo_Handbook parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Handbook(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HandbookRecord::parseFrom).toList()
        );
    }
}
