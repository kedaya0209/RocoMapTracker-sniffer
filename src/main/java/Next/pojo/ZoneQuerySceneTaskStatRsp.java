// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQuerySceneTaskStatRsp(
    RetInfo retInfo,
    TaskScenesvrStateData sceneStateData
) {
    public static ZoneQuerySceneTaskStatRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQuerySceneTaskStatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.TaskScenesvrStateData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneQuerySceneTaskStatRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQuerySceneTaskStatRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.TaskScenesvrStateData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
