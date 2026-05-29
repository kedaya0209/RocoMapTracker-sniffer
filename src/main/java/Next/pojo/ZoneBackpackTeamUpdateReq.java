// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBackpackTeamUpdateReq(
    List<Integer> newTeamPetGid
) {
    public static ZoneBackpackTeamUpdateReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBackpackTeamUpdateReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneBackpackTeamUpdateReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBackpackTeamUpdateReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
