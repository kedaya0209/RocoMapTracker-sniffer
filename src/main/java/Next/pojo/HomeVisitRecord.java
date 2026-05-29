// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeVisitRecord(
    int visitorUin,
    int visitTimestamp,
    int visitorIcon,
    byte[] visitorName,
    boolean isFriend,
    List<HomeDynamic> homeDynamics
) {
    public static HomeVisitRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeVisitRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HomeDynamic::parseFrom).toList()
        );
    }
    public static HomeVisitRecord parseFrom(java.util.List<ProtoField> fields) {
        return new HomeVisitRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HomeDynamic::parseFrom).toList()
        );
    }
}
