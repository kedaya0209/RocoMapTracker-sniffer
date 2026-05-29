// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneAIModifyLogicStatusReq(
    long npcObjId,
    List<LogicStatusOpInfo> operation
) {
    public static ZoneSceneAIModifyLogicStatusReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneAIModifyLogicStatusReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.LogicStatusOpInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneAIModifyLogicStatusReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneAIModifyLogicStatusReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.LogicStatusOpInfo::parseFrom).toList()
        );
    }
}
