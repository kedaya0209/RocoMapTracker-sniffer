// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleIdleReq(
    int casterPetId
) {
    public static BattleIdleReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleIdleReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static BattleIdleReq parseFrom(java.util.List<ProtoField> fields) {
        return new BattleIdleReq(
            Pojos.readInt(fields, 1)
        );
    }
}
