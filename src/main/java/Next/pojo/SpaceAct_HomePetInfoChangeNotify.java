// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomePetInfoChangeNotify(
    int actionType,
    ActorInfo_HomePet homePet
) {
    public static SpaceAct_HomePetInfoChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomePetInfoChangeNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_HomePet.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_HomePetInfoChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomePetInfoChangeNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_HomePet.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
