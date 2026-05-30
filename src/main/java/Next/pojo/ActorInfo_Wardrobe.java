// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Wardrobe(
    List<Integer> fashionWearId,
    String wardrobeName
) {
    public static ActorInfo_Wardrobe parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Wardrobe(
            Pojos.readIntList(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ActorInfo_Wardrobe parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Wardrobe(
            Pojos.readIntList(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
