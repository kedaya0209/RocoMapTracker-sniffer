// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CampRefreshPetEggInfo(
    int campId,
    List<RefreshPetEggData> campPetEggData
) {
    public static CampRefreshPetEggInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CampRefreshPetEggInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RefreshPetEggData::parseFrom).toList()
        );
    }
    public static CampRefreshPetEggInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CampRefreshPetEggInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RefreshPetEggData::parseFrom).toList()
        );
    }
}
