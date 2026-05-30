// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpEnergyData(
    List<PetEnvEnergyInfo> energyInfo,
    EnvEnergyInfo weather,
    Position lastUsedBattleCenter
) {
    public static SpEnergyData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpEnergyData(
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetEnvEnergyInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.EnvEnergyInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
    public static SpEnergyData parseFrom(java.util.List<ProtoField> fields) {
        return new SpEnergyData(
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetEnvEnergyInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.EnvEnergyInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
}
