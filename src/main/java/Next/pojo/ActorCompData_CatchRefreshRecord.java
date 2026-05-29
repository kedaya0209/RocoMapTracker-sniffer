// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_CatchRefreshRecord(
    CatchRecordInfo catchRefreshInfo
) {
    public static ActorCompData_CatchRefreshRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_CatchRefreshRecord(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CatchRecordInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorCompData_CatchRefreshRecord parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_CatchRefreshRecord(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CatchRecordInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
