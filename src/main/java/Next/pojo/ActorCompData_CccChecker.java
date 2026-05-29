// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_CccChecker(
    boolean cancelMovePosCheck,
    boolean openAirwallDead
) {
    public static ActorCompData_CccChecker parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_CccChecker(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ActorCompData_CccChecker parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_CccChecker(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
