// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_GameTime(
    boolean paused,
    long refGameTime,
    long refRealTime,
    int accelerativeRatio,
    long lastNtyGameTime,
    boolean enterNightMode
) {
    public static ActorCompData_GameTime parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_GameTime(
            Pojos.readBool(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static ActorCompData_GameTime parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_GameTime(
            Pojos.readBool(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
