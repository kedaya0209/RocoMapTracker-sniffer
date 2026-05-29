// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeTeamUpdateNotify(
    HomeTeamInfo teamInfo
) {
    public static ZoneSceneHomeTeamUpdateNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeTeamUpdateNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeTeamInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneHomeTeamUpdateNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeTeamUpdateNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeTeamInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
