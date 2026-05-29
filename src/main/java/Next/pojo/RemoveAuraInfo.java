// Generated from com_actor.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RemoveAuraInfo(
    long auraId,
    int reason,
    List<Long> mutexAuraId,
    CreateAuraInfo createInfo
) {
    public static RemoveAuraInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RemoveAuraInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readLongList(fields, 3),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.CreateAuraInfo.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
    public static RemoveAuraInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RemoveAuraInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readLongList(fields, 3),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.CreateAuraInfo.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
}
