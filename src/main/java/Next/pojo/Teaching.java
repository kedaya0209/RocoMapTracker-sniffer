// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record Teaching(
    int id,
    boolean isUnlock,
    List<TeachingUnlockProgress> unlockProgress
) {
    public static Teaching parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Teaching(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TeachingUnlockProgress::parseFrom).toList()
        );
    }
    public static Teaching parseFrom(java.util.List<ProtoField> fields) {
        return new Teaching(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TeachingUnlockProgress::parseFrom).toList()
        );
    }
}
