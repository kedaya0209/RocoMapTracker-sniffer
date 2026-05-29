// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CommonBuffData(
    BuffData_6_Common b6,
    BuffData_93_Common b93,
    BuffData_119_Common b119,
    BuffData_132_Common b132,
    BuffData_102_Common b102
) {
    public static CommonBuffData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CommonBuffData(
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BuffData_6_Common.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BuffData_93_Common.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BuffData_119_Common.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BuffData_132_Common.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BuffData_102_Common.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static CommonBuffData parseFrom(java.util.List<ProtoField> fields) {
        return new CommonBuffData(
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BuffData_6_Common.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BuffData_93_Common.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BuffData_119_Common.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BuffData_132_Common.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BuffData_102_Common.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
