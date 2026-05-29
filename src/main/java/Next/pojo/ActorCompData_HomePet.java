// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_HomePet(
    HomePetInfo homePetInfo,
    HomePetDisplayInfo displayInfo,
    List<ThiefInfo> thiefs,
    long eggObjId,
    HomePetData petData
) {
    public static ActorCompData_HomePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_HomePet(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomePetDisplayInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ThiefInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.HomePetData.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ActorCompData_HomePet parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_HomePet(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomePetDisplayInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ThiefInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.HomePetData.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
