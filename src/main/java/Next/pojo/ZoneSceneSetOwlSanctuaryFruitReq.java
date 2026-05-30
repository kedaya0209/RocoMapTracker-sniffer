// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneSetOwlSanctuaryFruitReq(
    int contentId,
    List<OwlSanctuaryFruitData> fruitData
) {
    public static ZoneSceneSetOwlSanctuaryFruitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSetOwlSanctuaryFruitReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitData::parseFrom).toList()
        );
    }
    public static ZoneSceneSetOwlSanctuaryFruitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSetOwlSanctuaryFruitReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitData::parseFrom).toList()
        );
    }
}
