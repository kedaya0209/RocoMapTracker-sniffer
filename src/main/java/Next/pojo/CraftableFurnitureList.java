// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CraftableFurnitureList(
    List<UnlockedFurniture> unlockedFurnitureList,
    List<Integer> recommendedIdList
) {
    public static CraftableFurnitureList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CraftableFurnitureList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList(),
            Pojos.readIntList(fields, 2)
        );
    }
    public static CraftableFurnitureList parseFrom(java.util.List<ProtoField> fields) {
        return new CraftableFurnitureList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.UnlockedFurniture::parseFrom).toList(),
            Pojos.readIntList(fields, 2)
        );
    }
}
