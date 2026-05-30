// Generated from com_handbook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetHandbook(
    List<HandbookRecordCollection> recordCollection,
    List<Integer> coverCandidateData,
    List<AreaHandbookInfo> areaHbInfos,
    int topicVersion
) {
    public static PetHandbook parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetHandbook(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookRecordCollection::parseFrom).toList(),
            Pojos.readIntList(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.AreaHandbookInfo::parseFrom).toList(),
            Pojos.readInt(fields, 11)
        );
    }
    public static PetHandbook parseFrom(java.util.List<ProtoField> fields) {
        return new PetHandbook(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookRecordCollection::parseFrom).toList(),
            Pojos.readIntList(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.AreaHandbookInfo::parseFrom).toList(),
            Pojos.readInt(fields, 11)
        );
    }
}
