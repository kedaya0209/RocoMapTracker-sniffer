// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_MsgRecover(
    RecoverMsgList recoverMsgData
) {
    public static ActorCompData_MsgRecover parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_MsgRecover(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RecoverMsgList.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorCompData_MsgRecover parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_MsgRecover(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RecoverMsgList.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
