// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HabitatNeighborData(
    int habitatId,
    NeighborData firstNeighbor,
    NeighborData secondNeighbor,
    List<Integer> commonAttrs,
    int commonIdentity
) {
    public static HabitatNeighborData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HabitatNeighborData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NeighborData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.NeighborData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static HabitatNeighborData parseFrom(java.util.List<ProtoField> fields) {
        return new HabitatNeighborData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NeighborData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.NeighborData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
