// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DotsComponentData(
    List<BytesData> componentDatas
) {
    public static DotsComponentData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsComponentData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BytesData::parseFrom).toList()
        );
    }
    public static DotsComponentData parseFrom(java.util.List<ProtoField> fields) {
        return new DotsComponentData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BytesData::parseFrom).toList()
        );
    }
}
