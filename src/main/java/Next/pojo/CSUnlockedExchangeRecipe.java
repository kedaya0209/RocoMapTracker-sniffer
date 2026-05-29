// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CSUnlockedExchangeRecipe(
    List<CSUnlockedExchangeRecipe_Recipe> recipes
) {
    public static CSUnlockedExchangeRecipe parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CSUnlockedExchangeRecipe(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CSUnlockedExchangeRecipe_Recipe::parseFrom).toList()
        );
    }
    public static CSUnlockedExchangeRecipe parseFrom(java.util.List<ProtoField> fields) {
        return new CSUnlockedExchangeRecipe(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CSUnlockedExchangeRecipe_Recipe::parseFrom).toList()
        );
    }
}
