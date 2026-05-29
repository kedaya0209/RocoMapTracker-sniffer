// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_BossFlowerSeed(
    List<FlowerSeedBossData> flowerSeedBossDatas
) {
    public static ActorCompData_BossFlowerSeed parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_BossFlowerSeed(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FlowerSeedBossData::parseFrom).toList()
        );
    }
    public static ActorCompData_BossFlowerSeed parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_BossFlowerSeed(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FlowerSeedBossData::parseFrom).toList()
        );
    }
}
