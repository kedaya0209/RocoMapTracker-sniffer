// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GlassTintChange(
    int fashionItemId,
    GlassInfo glass
) {
    public static GlassTintChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GlassTintChange(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static GlassTintChange parseFrom(java.util.List<ProtoField> fields) {
        return new GlassTintChange(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
