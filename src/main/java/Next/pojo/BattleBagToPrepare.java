// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleBagToPrepare(
    List<Integer> petId,
    List<Integer> toPos
) {
    public static BattleBagToPrepare parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBagToPrepare(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static BattleBagToPrepare parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBagToPrepare(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
