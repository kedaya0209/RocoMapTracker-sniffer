// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BallInfo(
    int id,
    byte[] name,
    int ballProb,
    int historySupProb,
    int hpSupProb,
    int ppSupProb,
    int happySupProb
) {
    public static BallInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BallInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static BallInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BallInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
