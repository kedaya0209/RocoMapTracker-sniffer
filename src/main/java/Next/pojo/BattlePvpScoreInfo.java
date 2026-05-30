// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlePvpScoreInfo(
    int extraObtainPvpScoreSource
) {
    public static BattlePvpScoreInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePvpScoreInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static BattlePvpScoreInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePvpScoreInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
