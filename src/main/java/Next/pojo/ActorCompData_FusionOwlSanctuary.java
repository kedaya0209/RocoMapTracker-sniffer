// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_FusionOwlSanctuary(
    List<Integer> generatedContentIds,
    List<FusionOwlSanctuaryInfo> owlSanctuaryDatas,
    int lastRefreshTimestamp,
    int currentUsedContentId
) {
    public static ActorCompData_FusionOwlSanctuary parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_FusionOwlSanctuary(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FusionOwlSanctuaryInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ActorCompData_FusionOwlSanctuary parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_FusionOwlSanctuary(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FusionOwlSanctuaryInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
