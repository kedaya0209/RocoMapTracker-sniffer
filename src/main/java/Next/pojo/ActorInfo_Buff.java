// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Buff(
    long id,
    int buffCfgId,
    int buffVal,
    List<String> strParamsList,
    List<Integer> intParamsList,
    long addBuffCasterId,
    long createTime
) {
    public static ActorInfo_Buff parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Buff(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readStringList(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
    public static ActorInfo_Buff parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Buff(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readStringList(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
}
