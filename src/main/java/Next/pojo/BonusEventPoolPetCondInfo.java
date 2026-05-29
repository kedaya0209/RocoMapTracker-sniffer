// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BonusEventPoolPetCondInfo(
    int catchTimes,
    List<BonusEventPoolPetCondRecord> condSatisfiedRecord
) {
    public static BonusEventPoolPetCondInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BonusEventPoolPetCondInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BonusEventPoolPetCondRecord::parseFrom).toList()
        );
    }
    public static BonusEventPoolPetCondInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BonusEventPoolPetCondInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BonusEventPoolPetCondRecord::parseFrom).toList()
        );
    }
}
