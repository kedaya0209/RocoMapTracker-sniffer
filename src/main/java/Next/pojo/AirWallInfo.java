// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AirWallInfo(
    List<Integer> airWallIds
) {
    public static AirWallInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AirWallInfo(
            Pojos.readIntList(fields, 1)
        );
    }
    public static AirWallInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AirWallInfo(
            Pojos.readIntList(fields, 1)
        );
    }
}
