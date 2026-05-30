// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmQuerySceneAssetSvnVersionRsp(
    RetInfo retInfo,
    int sceneResLogicId,
    int assetType,
    String svnVersion
) {
    public static ZoneGmQuerySceneAssetSvnVersionRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmQuerySceneAssetSvnVersionRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
    public static ZoneGmQuerySceneAssetSvnVersionRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmQuerySceneAssetSvnVersionRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
}
