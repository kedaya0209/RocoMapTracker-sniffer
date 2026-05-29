// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneNewFashionBondNotify(
    List<FashionBondItem> fashionBondItem,
    boolean isDeduct
) {
    public static ZoneNewFashionBondNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNewFashionBondNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FashionBondItem::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneNewFashionBondNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNewFashionBondNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FashionBondItem::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
}
