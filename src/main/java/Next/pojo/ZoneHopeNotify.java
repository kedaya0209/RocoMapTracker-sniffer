// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHopeNotify(
    HopeInstruction instruction
) {
    public static ZoneHopeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHopeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HopeInstruction.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneHopeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHopeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HopeInstruction.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
