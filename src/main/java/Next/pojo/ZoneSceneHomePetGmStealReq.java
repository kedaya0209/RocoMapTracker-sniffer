// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneHomePetGmStealReq(
    int uin,
    boolean isGet,
    List<HomePetGmStealInfo> stealInfo
) {
    public static ZoneSceneHomePetGmStealReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomePetGmStealReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomePetGmStealInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneHomePetGmStealReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomePetGmStealReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomePetGmStealInfo::parseFrom).toList()
        );
    }
}
