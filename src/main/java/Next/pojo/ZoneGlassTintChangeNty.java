// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGlassTintChangeNty(
    List<GlassTintChange> changeToClaimable,
    List<GlassTintChange> changeToLock
) {
    public static ZoneGlassTintChangeNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGlassTintChangeNty(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GlassTintChange::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GlassTintChange::parseFrom).toList()
        );
    }
    public static ZoneGlassTintChangeNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGlassTintChangeNty(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GlassTintChange::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GlassTintChange::parseFrom).toList()
        );
    }
}
