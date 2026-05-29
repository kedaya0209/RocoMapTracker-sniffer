// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_SalonChange(
    long actorId,
    List<SalonItemWearData> salonItemWearData
) {
    public static SpaceAct_SalonChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_SalonChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
    public static SpaceAct_SalonChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_SalonChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
}
