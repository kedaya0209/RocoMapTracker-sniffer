// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneGetFollowInfoReq(
    int confirmTalkId
) {
    public static ZoneSceneGetFollowInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGetFollowInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneGetFollowInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGetFollowInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
