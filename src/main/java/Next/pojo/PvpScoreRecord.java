// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PvpScoreRecord(
    int attackUin,
    int attackConfId,
    int score,
    int attackPetId,
    int attackPetGid,
    PetTypeInfo attackPetType,
    int defendUin,
    int defendConfId,
    int defendPetId,
    boolean isDefendRunaway,
    int mutationType,
    int blood,
    boolean carryFantasticSkill,
    PetTypeInfo type,
    int defendPetGid
) {
    public static PvpScoreRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpScoreRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16)
        );
    }
    public static PvpScoreRecord parseFrom(java.util.List<ProtoField> fields) {
        return new PvpScoreRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16)
        );
    }
}
