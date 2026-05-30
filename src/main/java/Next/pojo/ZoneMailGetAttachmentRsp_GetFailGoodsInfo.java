// Generated from zone_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMailGetAttachmentRsp_GetFailGoodsInfo(
    int goodsId,
    int type
) {
    public static ZoneMailGetAttachmentRsp_GetFailGoodsInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMailGetAttachmentRsp_GetFailGoodsInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneMailGetAttachmentRsp_GetFailGoodsInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMailGetAttachmentRsp_GetFailGoodsInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
