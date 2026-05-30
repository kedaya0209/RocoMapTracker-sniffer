// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcBattle(
    List<Integer> fightingUins
) {
    public static ActorCompData_NpcBattle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcBattle(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ActorCompData_NpcBattle parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcBattle(
            Pojos.readIntList(fields, 1)
        );
    }
}
