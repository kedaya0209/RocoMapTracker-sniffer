// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PvpFirstWinInfo(
    int winTime,
    byte[] enemyName,
    byte[] lastKilledPetName
) {
    public static PvpFirstWinInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpFirstWinInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static PvpFirstWinInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PvpFirstWinInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
