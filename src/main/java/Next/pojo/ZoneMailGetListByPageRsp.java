// Generated from zone_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMailGetListByPageRsp(
    RetInfo retInfo,
    MailInfoList mailList,
    int totalPage,
    int reqPage,
    int pageNum,
    long version,
    long noNewData
) {
    public static ZoneMailGetListByPageRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetListByPageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MailInfoList.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
    public static ZoneMailGetListByPageRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetListByPageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MailInfoList.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
}
