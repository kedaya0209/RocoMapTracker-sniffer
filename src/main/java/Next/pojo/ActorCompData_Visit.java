// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Visit(
    int lastAliveTime,
    List<VisitorData> visitorDatas,
    int enterTime,
    int leaveTime
) {
    public static ActorCompData_Visit parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Visit(
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.VisitorData::parseFrom).toList(),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static ActorCompData_Visit parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Visit(
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.VisitorData::parseFrom).toList(),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
