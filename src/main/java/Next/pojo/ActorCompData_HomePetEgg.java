// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_HomePetEgg(
    PetEggData eggData,
    int bagItemCfgId,
    boolean needCircuitBreakCheck,
    int momPetbaseCfgId
) {
    public static ActorCompData_HomePetEgg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_HomePetEgg(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetEggData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ActorCompData_HomePetEgg parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_HomePetEgg(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetEggData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
