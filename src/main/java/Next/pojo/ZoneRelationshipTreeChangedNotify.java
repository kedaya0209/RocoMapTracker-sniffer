// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRelationshipTreeChangedNotify(
    RelationshipTreeData treeData,
    boolean unlockReqFinish,
    boolean removeSendUnlockReq,
    boolean removeRecvUnlockReq,
    boolean relationshipTreeAddFriend
) {
    public static ZoneRelationshipTreeChangedNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRelationshipTreeChangedNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RelationshipTreeData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static ZoneRelationshipTreeChangedNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRelationshipTreeChangedNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RelationshipTreeData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
