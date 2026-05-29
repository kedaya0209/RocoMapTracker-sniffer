// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_PropertyType(
    List<Integer> propertyTypes
) {
    public static ActorInfo_PropertyType parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_PropertyType(
            Pojos.readIntList(fields, 2)
        );
    }
    public static ActorInfo_PropertyType parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_PropertyType(
            Pojos.readIntList(fields, 2)
        );
    }
}
