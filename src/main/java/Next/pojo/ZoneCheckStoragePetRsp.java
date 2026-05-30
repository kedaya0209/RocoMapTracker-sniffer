// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneCheckStoragePetRsp(
    RetInfo retInfo,
    List<Integer> canEvolvePets,
    List<Integer> canBreakthroughPets,
    List<ZoneCheckStoragePetRsp_EvolvePet> evolvePets
) {
    public static ZoneCheckStoragePetRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCheckStoragePetRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneCheckStoragePetRsp_EvolvePet::parseFrom).toList()
        );
    }
    public static ZoneCheckStoragePetRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCheckStoragePetRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneCheckStoragePetRsp_EvolvePet::parseFrom).toList()
        );
    }
}
