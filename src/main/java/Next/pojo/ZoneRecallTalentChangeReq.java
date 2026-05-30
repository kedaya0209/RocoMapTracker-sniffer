// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRecallTalentChangeReq(
    int petGid
) {
    public static ZoneRecallTalentChangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRecallTalentChangeReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneRecallTalentChangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRecallTalentChangeReq(
            Pojos.readInt(fields, 1)
        );
    }
}
