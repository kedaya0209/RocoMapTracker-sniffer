// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetClosenessInfo(
    int closenessExp,
    int closenessLv,
    List<PetClosenessHistoryInfo> historyInfoList
) {
    public static PetClosenessInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetClosenessInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetClosenessHistoryInfo::parseFrom).toList()
        );
    }
    public static PetClosenessInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetClosenessInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetClosenessHistoryInfo::parseFrom).toList()
        );
    }
}
