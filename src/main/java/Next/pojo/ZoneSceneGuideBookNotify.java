// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGuideBookNotify(
    int type,
    int bookId,
    List<Integer> stampIndex,
    GuideBook bookData
) {
    public static ZoneSceneGuideBookNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGuideBookNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GuideBook.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneSceneGuideBookNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGuideBookNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GuideBook.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
