// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_ClientOperation(
    ClientOperation operation
) {
    public static SpaceAct_ClientOperation parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ClientOperation(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClientOperation.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static SpaceAct_ClientOperation parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ClientOperation(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClientOperation.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
