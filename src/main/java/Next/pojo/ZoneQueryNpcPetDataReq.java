// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryNpcPetDataReq(
    int targetUin,
    int targetPetGid,
    long targetPetNpcId
) {
    public static ZoneQueryNpcPetDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryNpcPetDataReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneQueryNpcPetDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryNpcPetDataReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
