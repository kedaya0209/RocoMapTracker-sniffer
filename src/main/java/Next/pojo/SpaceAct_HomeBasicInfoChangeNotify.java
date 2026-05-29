// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomeBasicInfoChangeNotify(
    long cellId,
    ActorInfo_HomeBasicInfo homeBasicInfo
) {
    public static SpaceAct_HomeBasicInfoChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomeBasicInfoChangeNotify(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_HomeBasicInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_HomeBasicInfoChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomeBasicInfoChangeNotify(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_HomeBasicInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
