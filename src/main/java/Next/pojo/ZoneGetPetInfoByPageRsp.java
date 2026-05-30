// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPetInfoByPageRsp(
    RetInfo retInfo,
    int totalPage,
    int reqPage,
    PetDataInfoList petInfo,
    int pageNum,
    long version,
    long noNewData
) {
    public static ZoneGetPetInfoByPageRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetInfoByPageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetDataInfoList.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
    public static ZoneGetPetInfoByPageRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetInfoByPageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetDataInfoList.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
}
