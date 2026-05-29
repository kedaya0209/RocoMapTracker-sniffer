// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneNpcDialogSelectReq(
    long npcId,
    int optionId,
    int selectId,
    Point avatarPt,
    Point npcPt,
    Point battleCenter,
    int battleRadius
) {
    public static ZoneSceneNpcDialogSelectReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNpcDialogSelectReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneSceneNpcDialogSelectReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNpcDialogSelectReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 6)
        );
    }
}
