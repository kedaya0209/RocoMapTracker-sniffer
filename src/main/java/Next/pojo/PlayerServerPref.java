// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerServerPref(
    List<HeroPref> heroPrefs
) {
    public static PlayerServerPref parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerServerPref(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HeroPref::parseFrom).toList()
        );
    }
    public static PlayerServerPref parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerServerPref(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HeroPref::parseFrom).toList()
        );
    }
}
