// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneUseBagItemReq(
    int gid,
    int num,
    int para,
    List<Integer> changeAttrType,
    List<Integer> targetType,
    int changeTalentType,
    int resultType,
    int para2,
    int itemConfId
) {
    public static ZoneUseBagItemReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUseBagItemReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static ZoneUseBagItemReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUseBagItemReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
