// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPetHabitatRsp(
    RetInfo retInfo,
    List<Integer> areaConfId,
    HabitatAreaInfo areaInfo
) {
    public static ZoneGetPetHabitatRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetHabitatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HabitatAreaInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneGetPetHabitatRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetHabitatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HabitatAreaInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
