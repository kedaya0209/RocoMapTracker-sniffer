// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HabitatNeighborRelationInfo(
    List<HabitatNeighborData> habitatNeighborDatas
) {
    public static HabitatNeighborRelationInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HabitatNeighborRelationInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HabitatNeighborData::parseFrom).toList()
        );
    }
    public static HabitatNeighborRelationInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HabitatNeighborRelationInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HabitatNeighborData::parseFrom).toList()
        );
    }
}
