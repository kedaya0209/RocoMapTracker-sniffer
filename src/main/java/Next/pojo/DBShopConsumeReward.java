// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DBShopConsumeReward(
    int level,
    boolean isTaken
) {
    public static DBShopConsumeReward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBShopConsumeReward(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static DBShopConsumeReward parseFrom(java.util.List<ProtoField> fields) {
        return new DBShopConsumeReward(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
