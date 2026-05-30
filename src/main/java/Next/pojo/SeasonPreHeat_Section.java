// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SeasonPreHeat_Section(
    int idx,
    int statue,
    long finishTimestamp
) {
    public static SeasonPreHeat_Section parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SeasonPreHeat_Section(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static SeasonPreHeat_Section parseFrom(java.util.List<ProtoField> fields) {
        return new SeasonPreHeat_Section(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
