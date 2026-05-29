// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AvatarOwlSanctuaryInfo(
    int npcContentId,
    boolean isUpgrade,
    boolean isDetected,
    Position npcPos,
    List<OwlSanctuaryFruitBriefInfo> fruitBriefInfos,
    int level,
    OwlSanctuaryFruitInfo fruitInfo,
    long logicId,
    OwlSanctuaryDetectInfo detectInfo,
    long objId
) {
    public static AvatarOwlSanctuaryInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarOwlSanctuaryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.OwlSanctuaryFruitBriefInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.OwlSanctuaryFruitInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.OwlSanctuaryDetectInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readLong(fields, 11)
        );
    }
    public static AvatarOwlSanctuaryInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarOwlSanctuaryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.OwlSanctuaryFruitBriefInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.OwlSanctuaryFruitInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.OwlSanctuaryDetectInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readLong(fields, 11)
        );
    }
}
