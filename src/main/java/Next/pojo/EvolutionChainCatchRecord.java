// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record EvolutionChainCatchRecord(
    int evolutionChainId,
    int accTryCatchTime,
    int accCatchSuccTime,
    int accCatchFailTime,
    long lastTryCatchTime,
    long lastTryTime
) {
    public static EvolutionChainCatchRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EvolutionChainCatchRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6)
        );
    }
    public static EvolutionChainCatchRecord parseFrom(java.util.List<ProtoField> fields) {
        return new EvolutionChainCatchRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6)
        );
    }
}
