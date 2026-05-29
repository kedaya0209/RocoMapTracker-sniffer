// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneSetNpcPosReq(
    List<SetNpcPosItem> npcList
) {
    public static ZoneSceneSetNpcPosReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSetNpcPosReq(
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SetNpcPosItem::parseFrom).toList()
        );
    }
    public static ZoneSceneSetNpcPosReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSetNpcPosReq(
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SetNpcPosItem::parseFrom).toList()
        );
    }
}
