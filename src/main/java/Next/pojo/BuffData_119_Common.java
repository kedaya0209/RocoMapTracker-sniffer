// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_119_Common(
    List<Integer> usedSkill
) {
    public static BuffData_119_Common parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_119_Common(
            Pojos.readIntList(fields, 1)
        );
    }
    public static BuffData_119_Common parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_119_Common(
            Pojos.readIntList(fields, 1)
        );
    }
}
