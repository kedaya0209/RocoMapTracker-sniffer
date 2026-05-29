// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_ScenePets(
    List<ActorInfo_ScenePet> petInfos
) {
    public static ActorInfo_ScenePets parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_ScenePets(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo_ScenePet::parseFrom).toList()
        );
    }
    public static ActorInfo_ScenePets parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_ScenePets(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo_ScenePet::parseFrom).toList()
        );
    }
}
