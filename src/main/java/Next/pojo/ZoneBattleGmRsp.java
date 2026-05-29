// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleGmRsp(
    RetInfo retInfo,
    byte[] retValue,
    List<BattlePetInfo> pets
) {
    public static ZoneBattleGmRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleGmRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList()
        );
    }
    public static ZoneBattleGmRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleGmRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList()
        );
    }
}
