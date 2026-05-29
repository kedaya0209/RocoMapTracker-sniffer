// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HabitatAreaInfo(
    List<HabitatAreaInfo_GroupAreaIds> habitatAreas
) {
    public static HabitatAreaInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HabitatAreaInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HabitatAreaInfo_GroupAreaIds::parseFrom).toList()
        );
    }
    public static HabitatAreaInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HabitatAreaInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HabitatAreaInfo_GroupAreaIds::parseFrom).toList()
        );
    }
}
