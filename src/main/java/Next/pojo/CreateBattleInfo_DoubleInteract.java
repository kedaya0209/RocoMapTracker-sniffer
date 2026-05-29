// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CreateBattleInfo_DoubleInteract(
    int type,
    List<Integer> mateUins
) {
    public static CreateBattleInfo_DoubleInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreateBattleInfo_DoubleInteract(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static CreateBattleInfo_DoubleInteract parseFrom(java.util.List<ProtoField> fields) {
        return new CreateBattleInfo_DoubleInteract(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
