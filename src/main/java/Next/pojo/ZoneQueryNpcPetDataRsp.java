// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryNpcPetDataRsp(
    RetInfo retInfo,
    FriendRoleInfo playerInfo,
    int relationshipType,
    PetData targetPetData,
    boolean isFirstInteract
) {
    public static ZoneQueryNpcPetDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryNpcPetDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5)
        );
    }
    public static ZoneQueryNpcPetDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryNpcPetDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5)
        );
    }
}
