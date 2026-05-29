// Generated from com_pet_egg.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GiftEggList(
    int lastRefreshTime,
    List<GiftEggInfo> infos
) {
    public static GiftEggList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GiftEggList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GiftEggInfo::parseFrom).toList()
        );
    }
    public static GiftEggList parseFrom(java.util.List<ProtoField> fields) {
        return new GiftEggList(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GiftEggInfo::parseFrom).toList()
        );
    }
}
