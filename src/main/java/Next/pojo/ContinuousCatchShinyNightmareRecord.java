// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ContinuousCatchShinyNightmareRecord(
    int evolutionGroupId,
    int nightmareKeepTime
) {
    public static ContinuousCatchShinyNightmareRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ContinuousCatchShinyNightmareRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ContinuousCatchShinyNightmareRecord parseFrom(java.util.List<ProtoField> fields) {
        return new ContinuousCatchShinyNightmareRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
