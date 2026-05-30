// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGmSetNpcPosReq(
    List<SetNpcPosItem> npcList
) {
    public static ZoneSceneGmSetNpcPosReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGmSetNpcPosReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SetNpcPosItem::parseFrom).toList()
        );
    }
    public static ZoneSceneGmSetNpcPosReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGmSetNpcPosReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SetNpcPosItem::parseFrom).toList()
        );
    }
}
