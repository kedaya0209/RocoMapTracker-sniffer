// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGeneralOpReq(
    int opType,
    List<Long> paramList
) {
    public static ZoneSceneGeneralOpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGeneralOpReq(
            Pojos.readInt(fields, 1),
            Pojos.readLongList(fields, 2)
        );
    }
    public static ZoneSceneGeneralOpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGeneralOpReq(
            Pojos.readInt(fields, 1),
            Pojos.readLongList(fields, 2)
        );
    }
}
