// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_MagicCreateNpcChange(
    long actorId,
    MagicCreateNpcInfo npcInfo,
    boolean addOrDelete
) {
    public static SpaceAct_MagicCreateNpcChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_MagicCreateNpcChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MagicCreateNpcInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
    public static SpaceAct_MagicCreateNpcChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_MagicCreateNpcChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MagicCreateNpcInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
}
