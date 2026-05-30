// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffbaseRunningData(
    int idx,
    BuffData_6 b6,
    BuffData_32 b32,
    BuffData_52 b52,
    BuffData_55 b55,
    BuffData_56 b56,
    BuffData_62 b62,
    BuffData_63 b63,
    BuffData_64 b64,
    BuffData_72 b72,
    BuffData_77 b77,
    BuffData_81 b81,
    BuffData_89 b89,
    BuffData_90 b90,
    BuffData_91 b91,
    BuffData_92 b92,
    BuffData_93 b93,
    BuffData_95 b95,
    BuffData_96 b96,
    BuffData_102 b102,
    BuffData_103 b103,
    BuffData_113 b113,
    BuffData_121 b121,
    BuffData_125 b125,
    BuffData_126 b126,
    BuffData_134 b134
) {
    public static BuffbaseRunningData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffbaseRunningData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 27) != null ? Next.pojo.BuffData_6.parseFrom(Pojos.readMessage(fields, 27)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BuffData_32.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BuffData_52.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.BuffData_55.parseFrom(Pojos.readMessage(fields, 23)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.BuffData_56.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.BuffData_62.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 24) != null ? Next.pojo.BuffData_63.parseFrom(Pojos.readMessage(fields, 24)) : null,
            Pojos.readMessage(fields, 26) != null ? Next.pojo.BuffData_64.parseFrom(Pojos.readMessage(fields, 26)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BuffData_72.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BuffData_77.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BuffData_81.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BuffData_89.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BuffData_90.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.BuffData_91.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.BuffData_92.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.BuffData_93.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.BuffData_95.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.BuffData_96.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.BuffData_102.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.BuffData_103.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.BuffData_113.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.BuffData_121.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.BuffData_125.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.BuffData_126.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 25) != null ? Next.pojo.BuffData_134.parseFrom(Pojos.readMessage(fields, 25)) : null
        );
    }
    public static BuffbaseRunningData parseFrom(java.util.List<ProtoField> fields) {
        return new BuffbaseRunningData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 27) != null ? Next.pojo.BuffData_6.parseFrom(Pojos.readMessage(fields, 27)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BuffData_32.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BuffData_52.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.BuffData_55.parseFrom(Pojos.readMessage(fields, 23)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.BuffData_56.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.BuffData_62.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 24) != null ? Next.pojo.BuffData_63.parseFrom(Pojos.readMessage(fields, 24)) : null,
            Pojos.readMessage(fields, 26) != null ? Next.pojo.BuffData_64.parseFrom(Pojos.readMessage(fields, 26)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BuffData_72.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BuffData_77.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BuffData_81.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BuffData_89.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BuffData_90.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.BuffData_91.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.BuffData_92.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.BuffData_93.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.BuffData_95.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.BuffData_96.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.BuffData_102.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.BuffData_103.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.BuffData_113.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.BuffData_121.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.BuffData_125.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.BuffData_126.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 25) != null ? Next.pojo.BuffData_134.parseFrom(Pojos.readMessage(fields, 25)) : null
        );
    }
}
