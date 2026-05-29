// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityInheritPetData(
    PetBriefInfo inheritPetInfo,
    boolean addRedpoint,
    boolean firstUploaded,
    long reserved1
) {
    public static PlayerActivityInfo_ActivityInheritPetData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityInheritPetData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static PlayerActivityInfo_ActivityInheritPetData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityInheritPetData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
