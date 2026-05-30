// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetBoxTidyRsp(
    RetInfo retInfo,
    List<PetBox> boxInfo,
    int lastOpenBoxId
) {
    public static ZonePetBoxTidyRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxTidyRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetBox::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZonePetBoxTidyRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxTidyRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetBox::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
}
