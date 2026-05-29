// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record StartArg(
    List<PetStartArg> pets,
    List<Integer> magicSkills
) {
    public static StartArg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new StartArg(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetStartArg::parseFrom).toList(),
            Pojos.readIntList(fields, 2)
        );
    }
    public static StartArg parseFrom(java.util.List<ProtoField> fields) {
        return new StartArg(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetStartArg::parseFrom).toList(),
            Pojos.readIntList(fields, 2)
        );
    }
}
