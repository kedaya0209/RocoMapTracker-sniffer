// Generated from com_monster.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CheerMonsterInitInfo(
    int confId,
    long sid,
    int tag,
    int enterIndex,
    int level,
    long aiStatus,
    int preActTag,
    int preActParam,
    MonsterDiffInfo monsterDiffInfo
) {
    public static CheerMonsterInitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CheerMonsterInitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.MonsterDiffInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static CheerMonsterInitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CheerMonsterInitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.MonsterDiffInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
