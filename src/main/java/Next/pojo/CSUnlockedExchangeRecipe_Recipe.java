// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CSUnlockedExchangeRecipe_Recipe(
    int exchangeId,
    boolean isOnlineShared
) {
    public static CSUnlockedExchangeRecipe_Recipe parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CSUnlockedExchangeRecipe_Recipe(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static CSUnlockedExchangeRecipe_Recipe parseFrom(java.util.List<ProtoField> fields) {
        return new CSUnlockedExchangeRecipe_Recipe(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
