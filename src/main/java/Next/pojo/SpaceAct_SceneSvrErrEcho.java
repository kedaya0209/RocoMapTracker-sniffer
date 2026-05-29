// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_SceneSvrErrEcho(
    byte[] errStr
) {
    public static SpaceAct_SceneSvrErrEcho parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_SceneSvrErrEcho(
            Pojos.readBytes(fields, 1)
        );
    }
    public static SpaceAct_SceneSvrErrEcho parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_SceneSvrErrEcho(
            Pojos.readBytes(fields, 1)
        );
    }
}
