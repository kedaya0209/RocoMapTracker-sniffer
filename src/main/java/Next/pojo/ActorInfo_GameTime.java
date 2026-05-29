// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_GameTime(
    boolean paused,
    long refGameTime,
    long refRealTime,
    int accelerativeRatio
) {
    public static ActorInfo_GameTime parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_GameTime(
            Pojos.readBool(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ActorInfo_GameTime parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_GameTime(
            Pojos.readBool(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
