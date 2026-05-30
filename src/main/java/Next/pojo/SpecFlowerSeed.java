// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpecFlowerSeed(
    int specFlowerSeedId,
    int contentCfgId,
    int seedStar,
    InnerPet innerPet,
    int catchVitemQuantity,
    int activityId,
    int endTimestamp,
    List<InnerBattleTask> battleTasks,
    int bindPetGid,
    int bindPetbaseId,
    int bindEvolutionId,
    int medalId
) {
    public static SpecFlowerSeed parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpecFlowerSeed(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InnerPet.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static SpecFlowerSeed parseFrom(java.util.List<ProtoField> fields) {
        return new SpecFlowerSeed(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InnerPet.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
