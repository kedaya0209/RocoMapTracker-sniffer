// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCardBriefInfo_CollectPetInfo(
    int skillDamType,
    int petBaseId,
    int mutationDiffType,
    int index
) {
    public static PlayerCardBriefInfo_CollectPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardBriefInfo_CollectPetInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4)
        );
    }
    public static PlayerCardBriefInfo_CollectPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardBriefInfo_CollectPetInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4)
        );
    }
}
