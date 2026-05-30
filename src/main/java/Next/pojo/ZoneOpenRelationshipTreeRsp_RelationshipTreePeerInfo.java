// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo(
    String openid,
    int uin,
    byte[] name,
    byte[] note,
    int level,
    int gender,
    byte[] signature,
    int battleState,
    PlayerBattleBriefInfo battleBriefInfo,
    int cardIconSelected
) {
    public static ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8, 0),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10)
        );
    }
    public static ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8, 0),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10)
        );
    }
}
