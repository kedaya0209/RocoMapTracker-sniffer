// Generated from com_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DotsServerAIOwnerPlayerInfo(
    long playerId,
    Point pt
) {
    public static DotsServerAIOwnerPlayerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsServerAIOwnerPlayerInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static DotsServerAIOwnerPlayerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DotsServerAIOwnerPlayerInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
