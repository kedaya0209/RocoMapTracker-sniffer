// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_LogicStatus(
    List<LogicStatusData> statusInfo,
    List<DelayProcessStatusData> deleyProcessInfo
) {
    public static ActorCompData_LogicStatus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_LogicStatus(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.LogicStatusData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DelayProcessStatusData::parseFrom).toList()
        );
    }
    public static ActorCompData_LogicStatus parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_LogicStatus(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.LogicStatusData::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.DelayProcessStatusData::parseFrom).toList()
        );
    }
}
