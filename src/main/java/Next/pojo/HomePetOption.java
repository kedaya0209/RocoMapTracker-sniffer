// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePetOption(
    List<Integer> optionCfgId
) {
    public static HomePetOption parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetOption(
            Pojos.readIntList(fields, 1)
        );
    }
    public static HomePetOption parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetOption(
            Pojos.readIntList(fields, 1)
        );
    }
}
