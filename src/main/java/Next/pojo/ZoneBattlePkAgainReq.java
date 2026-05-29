// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattlePkAgainReq(
    boolean pkAgain
) {
    public static ZoneBattlePkAgainReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattlePkAgainReq(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZoneBattlePkAgainReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattlePkAgainReq(
            Pojos.readBool(fields, 1)
        );
    }
}
