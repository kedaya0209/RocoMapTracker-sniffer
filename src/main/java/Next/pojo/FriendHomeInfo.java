// Generated from friend_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FriendHomeInfo(
    byte[] homeName,
    int homeExperience,
    int homeLevel,
    int roomLevel,
    int homeComfortLevel,
    boolean homePetCanSteal,
    boolean homePlantCanPick,
    List<HomePetBriefInfo> homePets,
    CraftableFurnitureList craftableFurniture
) {
    public static FriendHomeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendHomeInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.HomePetBriefInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 40) != null ? Next.pojo.CraftableFurnitureList.parseFrom(Pojos.readMessage(fields, 40)) : null
        );
    }
    public static FriendHomeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FriendHomeInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.HomePetBriefInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 40) != null ? Next.pojo.CraftableFurnitureList.parseFrom(Pojos.readMessage(fields, 40)) : null
        );
    }
}
