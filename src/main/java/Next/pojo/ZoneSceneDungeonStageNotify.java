// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneDungeonStageNotify(
    int dungeonCfgId,
    List<Integer> stageCfgId,
    boolean dungeonFinish
) {
    public static ZoneSceneDungeonStageNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneDungeonStageNotify(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneSceneDungeonStageNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneDungeonStageNotify(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
