// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneUpdatePetCollectTagReq(
    List<ZoneUpdatePetCollectTagReq_CollectionInfo> collectionInfo
) {
    public static ZoneUpdatePetCollectTagReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpdatePetCollectTagReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneUpdatePetCollectTagReq_CollectionInfo::parseFrom).toList()
        );
    }
    public static ZoneUpdatePetCollectTagReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpdatePetCollectTagReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneUpdatePetCollectTagReq_CollectionInfo::parseFrom).toList()
        );
    }
}
