// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneModifyBagItemFlagsReq_ModifyInfo(
    int gid,
    int bagItemFlags,
    int slotIdx,
    int itemConfId
) {
    public static ZoneModifyBagItemFlagsReq_ModifyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneModifyBagItemFlagsReq_ModifyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneModifyBagItemFlagsReq_ModifyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneModifyBagItemFlagsReq_ModifyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
