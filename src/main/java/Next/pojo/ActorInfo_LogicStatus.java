// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_LogicStatus(
    int status,
    byte[] variant,
    LogicStatusExtraData extraData
) {
    public static ActorInfo_LogicStatus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_LogicStatus(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LogicStatusExtraData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ActorInfo_LogicStatus parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_LogicStatus(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LogicStatusExtraData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
