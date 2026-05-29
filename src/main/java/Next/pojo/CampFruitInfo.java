// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CampFruitInfo(
    List<CampFruitData> fruitData,
    long lastFruitTakeOutTimestamp
) {
    public static CampFruitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CampFruitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CampFruitData::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
    public static CampFruitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CampFruitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CampFruitData::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
}
