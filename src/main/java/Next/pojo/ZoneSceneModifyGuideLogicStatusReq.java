// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneModifyGuideLogicStatusReq(
    LogicStatusOpInfo op
) {
    public static ZoneSceneModifyGuideLogicStatusReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneModifyGuideLogicStatusReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.LogicStatusOpInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneModifyGuideLogicStatusReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneModifyGuideLogicStatusReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.LogicStatusOpInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
