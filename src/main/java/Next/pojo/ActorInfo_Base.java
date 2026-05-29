// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_Base(
    int detailType,
    long actorId,
    long logicId,
    int bornTime,
    long ownerId,
    Point bornPt,
    long cellId,
    Point pt,
    int enterSceneTimes,
    int lv,
    String name,
    int gender,
    ActorInfo_BornDie bornDieInfo,
    long platformActorId
) {
    public static ActorInfo_Base parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Base(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ActorInfo_BornDie.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readLong(fields, 15)
        );
    }
    public static ActorInfo_Base parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Base(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ActorInfo_BornDie.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readLong(fields, 15)
        );
    }
}
