// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityDropGroup(
    int methodId,
    List<PlayerActivityInfo_ActivityDropItem> dropItemList,
    boolean reachDailyLimit
) {
    public static PlayerActivityInfo_ActivityDropGroup parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityDropGroup(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityDropItem::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
    public static PlayerActivityInfo_ActivityDropGroup parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityDropGroup(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityDropItem::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
}
