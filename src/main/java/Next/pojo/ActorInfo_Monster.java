// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_Monster(
    ActorInfo_Base base
) {
    public static ActorInfo_Monster parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Monster(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_Base.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorInfo_Monster parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Monster(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_Base.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
