// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcInteract(
    List<ActorInfo_NpcOptionInfo> optionInfos,
    List<VisitorOnly_NpcOptionInfo> visitorOnlyOptionInfos,
    ActorInfo_NpcSeatInfo seatInfo
) {
    public static ActorInfo_NpcInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcInteract(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo_NpcOptionInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.VisitorOnly_NpcOptionInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_NpcSeatInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ActorInfo_NpcInteract parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcInteract(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo_NpcOptionInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.VisitorOnly_NpcOptionInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_NpcSeatInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
