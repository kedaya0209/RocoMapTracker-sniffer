// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCropFruitList(
    List<PlayerCropFruitInfo> cropFruitList
) {
    public static PlayerCropFruitList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCropFruitList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerCropFruitInfo::parseFrom).toList()
        );
    }
    public static PlayerCropFruitList parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCropFruitList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerCropFruitInfo::parseFrom).toList()
        );
    }
}
