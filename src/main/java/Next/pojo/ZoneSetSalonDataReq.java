// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetSalonDataReq(
    List<SalonItemWearData> salonItemWearData
) {
    public static ZoneSetSalonDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetSalonDataReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
    public static ZoneSetSalonDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetSalonDataReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList()
        );
    }
}
