// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GmNpcBlackboard(
    long actorId,
    byte[] blackboardStr
) {
    public static GmNpcBlackboard parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GmNpcBlackboard(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static GmNpcBlackboard parseFrom(java.util.List<ProtoField> fields) {
        return new GmNpcBlackboard(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
