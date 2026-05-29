// Generated from com_base_types.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RecordFileData(
    String battleId,
    String uin,
    RecordItemList battleData
) {
    public static RecordFileData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecordFileData(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.RecordItemList.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static RecordFileData parseFrom(java.util.List<ProtoField> fields) {
        return new RecordFileData(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.RecordItemList.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
