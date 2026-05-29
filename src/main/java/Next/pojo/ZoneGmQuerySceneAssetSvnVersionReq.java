// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmQuerySceneAssetSvnVersionReq(
    int sceneResLogicId,
    int assetType,
    Position pos
) {
    public static ZoneGmQuerySceneAssetSvnVersionReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmQuerySceneAssetSvnVersionReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneGmQuerySceneAssetSvnVersionReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmQuerySceneAssetSvnVersionReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
