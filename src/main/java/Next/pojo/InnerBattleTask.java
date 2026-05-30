// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InnerBattleTask(
    int taskId,
    int taskState,
    FlowerCatchInfo catchInfo
) {
    public static InnerBattleTask parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InnerBattleTask(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FlowerCatchInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static InnerBattleTask parseFrom(java.util.List<ProtoField> fields) {
        return new InnerBattleTask(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FlowerCatchInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
