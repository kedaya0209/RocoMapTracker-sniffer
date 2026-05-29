// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCliBuffInfo(
    String buff,
    PlayerServerPref severPref
) {
    public static PlayerCliBuffInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCliBuffInfo(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerServerPref.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static PlayerCliBuffInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCliBuffInfo(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerServerPref.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
