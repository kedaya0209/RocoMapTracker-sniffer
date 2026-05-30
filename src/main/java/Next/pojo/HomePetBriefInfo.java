// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomePetBriefInfo(
    HomePetInfo homePetInfo,
    HomePetDisplayInfo displayInfo,
    boolean canSteal,
    boolean haveEgg
) {
    public static HomePetBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetBriefInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomePetDisplayInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static HomePetBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetBriefInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomePetDisplayInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
