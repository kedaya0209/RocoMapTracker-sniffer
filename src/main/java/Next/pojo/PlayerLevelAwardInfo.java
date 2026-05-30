// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerLevelAwardInfo(
    List<Integer> validAwards
) {
    public static PlayerLevelAwardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerLevelAwardInfo(
            Pojos.readIntList(fields, 1)
        );
    }
    public static PlayerLevelAwardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerLevelAwardInfo(
            Pojos.readIntList(fields, 1)
        );
    }
}
