// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LogicStatusBeastBattle(
    boolean beastBattleEnd
) {
    public static LogicStatusBeastBattle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LogicStatusBeastBattle(
            Pojos.readBool(fields, 1)
        );
    }
    public static LogicStatusBeastBattle parseFrom(java.util.List<ProtoField> fields) {
        return new LogicStatusBeastBattle(
            Pojos.readBool(fields, 1)
        );
    }
}
