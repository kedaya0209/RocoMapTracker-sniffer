// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmPlayerStoryFlagModifyReq(
    int storyFlag,
    List<Integer> extraStoryFlags,
    boolean isAdd
) {
    public static ZoneGmPlayerStoryFlagModifyReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmPlayerStoryFlagModifyReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 3),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneGmPlayerStoryFlagModifyReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmPlayerStoryFlagModifyReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 3),
            Pojos.readBool(fields, 2)
        );
    }
}
