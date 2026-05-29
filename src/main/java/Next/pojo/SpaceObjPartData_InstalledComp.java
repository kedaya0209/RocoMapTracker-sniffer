// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceObjPartData_InstalledComp(
    List<Integer> comps
) {
    public static SpaceObjPartData_InstalledComp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceObjPartData_InstalledComp(
            Pojos.readIntList(fields, 1)
        );
    }
    public static SpaceObjPartData_InstalledComp parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceObjPartData_InstalledComp(
            Pojos.readIntList(fields, 1)
        );
    }
}
