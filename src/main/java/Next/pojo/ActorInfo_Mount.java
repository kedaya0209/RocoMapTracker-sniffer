// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_Mount(
    int mountStatusType,
    int mountSkillId
) {
    public static ActorInfo_Mount parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Mount(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ActorInfo_Mount parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Mount(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
