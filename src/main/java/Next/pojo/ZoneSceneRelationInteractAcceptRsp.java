// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRelationInteractAcceptRsp(
    RetInfo retInfo,
    int targetUin,
    int interactType,
    int interactSubType,
    InteractParam param,
    BanInfo banInfo
) {
    public static ZoneSceneRelationInteractAcceptRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRelationInteractAcceptRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ZoneSceneRelationInteractAcceptRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRelationInteractAcceptRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
