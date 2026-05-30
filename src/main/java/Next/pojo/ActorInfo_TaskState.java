// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_TaskState(
    List<Integer> enabledStateIds
) {
    public static ActorInfo_TaskState parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_TaskState(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ActorInfo_TaskState parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_TaskState(
            Pojos.readIntList(fields, 1)
        );
    }
}
