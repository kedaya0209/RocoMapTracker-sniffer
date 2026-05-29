// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleFinalBattleP2SummonReq(
    byte[] name,
    int confirmed,
    PetData pet
) {
    public static ZoneBattleFinalBattleP2SummonReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleFinalBattleP2SummonReq(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneBattleFinalBattleP2SummonReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleFinalBattleP2SummonReq(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
