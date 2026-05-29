// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorPartData_TaskNpc(
    int taskNpcCfgId
) {
    public static ActorPartData_TaskNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPartData_TaskNpc(
            Pojos.readInt(fields, 1)
        );
    }
    public static ActorPartData_TaskNpc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPartData_TaskNpc(
            Pojos.readInt(fields, 1)
        );
    }
}
