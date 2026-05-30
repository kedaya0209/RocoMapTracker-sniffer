// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerPvpData_BaseId2Cnt(
    int baseId,
    int cnt
) {
    public static PlayerPvpData_BaseId2Cnt parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPvpData_BaseId2Cnt(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerPvpData_BaseId2Cnt parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPvpData_BaseId2Cnt(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
