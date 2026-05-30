// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GlobalConfInfo(
    int num,
    List<Integer> numList,
    String str,
    String key,
    int id
) {
    public static GlobalConfInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GlobalConfInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static GlobalConfInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GlobalConfInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
