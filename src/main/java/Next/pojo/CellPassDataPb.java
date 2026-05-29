// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CellPassDataPb(
    CellPassDataHome homeData
) {
    public static CellPassDataPb parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellPassDataPb(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CellPassDataHome.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static CellPassDataPb parseFrom(java.util.List<ProtoField> fields) {
        return new CellPassDataPb(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CellPassDataHome.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
