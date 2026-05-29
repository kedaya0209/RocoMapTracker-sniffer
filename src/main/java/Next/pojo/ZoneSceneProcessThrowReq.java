// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneProcessThrowReq(
    int throwType,
    int gid,
    List<ThrowTargetNpcInfo> throwTargetNpcInfos,
    long throwId,
    int itemConfId
) {
    public static ZoneSceneProcessThrowReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneProcessThrowReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ThrowTargetNpcInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneSceneProcessThrowReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneProcessThrowReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ThrowTargetNpcInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
