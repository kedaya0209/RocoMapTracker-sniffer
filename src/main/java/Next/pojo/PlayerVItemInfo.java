// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerVItemInfo(
    List<Integer> vitemListNouse,
    List<Integer> liabilitiesNumNouse,
    List<Long> vitemList,
    List<Long> liabilitiesNum,
    boolean isFinishDataCopy
) {
    public static PlayerVItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerVItemInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readLongList(fields, 3),
            Pojos.readLongList(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static PlayerVItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerVItemInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readLongList(fields, 3),
            Pojos.readLongList(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
