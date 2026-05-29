// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneOpenRelationshipTreeRsp(
    RetInfo retInfo,
    RelationshipTreeData treeData,
    int unlockRelationType,
    int peerBattleState,
    PlayerBattleBriefInfo peerBattleBriefInfo,
    ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo peerInfo
) {
    public static ZoneOpenRelationshipTreeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneOpenRelationshipTreeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RelationshipTreeData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ZoneOpenRelationshipTreeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneOpenRelationshipTreeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RelationshipTreeData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerBattleBriefInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ZoneOpenRelationshipTreeRsp_RelationshipTreePeerInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
