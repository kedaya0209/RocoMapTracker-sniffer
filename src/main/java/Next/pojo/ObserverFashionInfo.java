// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ObserverFashionInfo(
    int uin,
    int pos,
    int gender,
    BattleFashionInfo appearanceInfo
) {
    public static ObserverFashionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ObserverFashionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ObserverFashionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ObserverFashionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
