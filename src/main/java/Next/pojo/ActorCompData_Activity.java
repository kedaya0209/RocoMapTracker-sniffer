// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Activity(
    List<ActivityData> activity,
    List<SpecFlowerSeed> specFlowerSeed,
    boolean useStar,
    int unglassFlowerNpcNum,
    int bossChallengeId,
    int lastChallengeId,
    int roundNum,
    int dungeonCfgId,
    List<ActivityContentData> activityContents
) {
    public static ActorCompData_Activity parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Activity(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActivityData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpecFlowerSeed::parseFrom).toList(),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.ActivityContentData::parseFrom).toList()
        );
    }
    public static ActorCompData_Activity parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Activity(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActivityData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpecFlowerSeed::parseFrom).toList(),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.ActivityContentData::parseFrom).toList()
        );
    }
}
