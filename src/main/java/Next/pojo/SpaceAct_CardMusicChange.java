// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_CardMusicChange(
    long actorId,
    int cardMusicId
) {
    public static SpaceAct_CardMusicChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CardMusicChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static SpaceAct_CardMusicChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CardMusicChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
