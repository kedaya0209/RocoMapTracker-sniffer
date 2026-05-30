// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffInfo(
    long id,
    int buffCfgId,
    long timeOutTime,
    long tickTimeOutTime,
    long createTime,
    long bindAuraId,
    int buffVal,
    List<String> strParamsList,
    List<Integer> intParamsList,
    long addBuffCasterId,
    int overlays
) {
    public static BuffInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readStringList(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static BuffInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BuffInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readStringList(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
