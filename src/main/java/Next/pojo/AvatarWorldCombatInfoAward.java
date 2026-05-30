// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarWorldCombatInfoAward(
    long bossNpcObjId,
    long refreshTime
) {
    public static AvatarWorldCombatInfoAward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarWorldCombatInfoAward(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 3)
        );
    }
    public static AvatarWorldCombatInfoAward parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarWorldCombatInfoAward(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 3)
        );
    }
}
