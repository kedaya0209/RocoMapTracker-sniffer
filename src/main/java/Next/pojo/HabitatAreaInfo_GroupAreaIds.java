// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HabitatAreaInfo_GroupAreaIds(
    List<Integer> areaConfId
) {
    public static HabitatAreaInfo_GroupAreaIds parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HabitatAreaInfo_GroupAreaIds(
            Pojos.readIntList(fields, 1)
        );
    }
    public static HabitatAreaInfo_GroupAreaIds parseFrom(java.util.List<ProtoField> fields) {
        return new HabitatAreaInfo_GroupAreaIds(
            Pojos.readIntList(fields, 1)
        );
    }
}
