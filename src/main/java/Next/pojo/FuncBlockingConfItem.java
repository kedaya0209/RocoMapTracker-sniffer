// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FuncBlockingConfItem(
    int funcId,
    int isOpen,
    int isAudit,
    int versionRule,
    String openClientVersionIos,
    String openClientVersionAndroid,
    String openClientVersionPc,
    int channelConfId,
    String openClientVersionHarmonyOs,
    String openClientVersionHarmonyPc,
    List<Integer> loginPlatLimit
) {
    public static FuncBlockingConfItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FuncBlockingConfItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readIntList(fields, 11)
        );
    }
    public static FuncBlockingConfItem parseFrom(java.util.List<ProtoField> fields) {
        return new FuncBlockingConfItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readIntList(fields, 11)
        );
    }
}
