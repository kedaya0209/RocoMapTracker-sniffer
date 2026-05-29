// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeAccessInfo(
    HomeBanInfo banInfo,
    HomeViolationInfo violationInfo
) {
    public static HomeAccessInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeAccessInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeBanInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeViolationInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static HomeAccessInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeAccessInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeBanInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeViolationInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
