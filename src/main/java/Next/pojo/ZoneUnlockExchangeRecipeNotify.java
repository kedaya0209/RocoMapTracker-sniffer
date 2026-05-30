// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUnlockExchangeRecipeNotify(
    CSUnlockedExchangeRecipe recipes,
    boolean isFull
) {
    public static ZoneUnlockExchangeRecipeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUnlockExchangeRecipeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CSUnlockedExchangeRecipe.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneUnlockExchangeRecipeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUnlockExchangeRecipeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CSUnlockedExchangeRecipe.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
}
