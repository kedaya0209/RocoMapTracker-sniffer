// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPetStatRsp(
    RetInfo retInfo,
    List<HandbookRecordCollection> hbColl,
    long version
) {
    public static ZoneGetPetStatRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetStatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookRecordCollection::parseFrom).toList(),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneGetPetStatRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetStatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookRecordCollection::parseFrom).toList(),
            Pojos.readLong(fields, 3)
        );
    }
}
