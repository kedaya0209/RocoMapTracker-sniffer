// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmExecCommGmCmdReq(
    CommGmCmd cmd
) {
    public static ZoneGmExecCommGmCmdReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmExecCommGmCmdReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CommGmCmd.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneGmExecCommGmCmdReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmExecCommGmCmdReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CommGmCmd.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
