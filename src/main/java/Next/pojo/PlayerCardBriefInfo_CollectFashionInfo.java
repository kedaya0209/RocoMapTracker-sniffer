// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCardBriefInfo_CollectFashionInfo(
    int fashionBondId,
    int index
) {
    public static PlayerCardBriefInfo_CollectFashionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardBriefInfo_CollectFashionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerCardBriefInfo_CollectFashionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardBriefInfo_CollectFashionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
