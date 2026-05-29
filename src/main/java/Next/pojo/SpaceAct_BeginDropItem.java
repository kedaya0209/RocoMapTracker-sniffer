// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_BeginDropItem(
    long srcNpcId,
    Position srcNpcPos,
    int srcNpcCfgId,
    int srcNpcRefCfgId,
    long batchNum,
    int dropItmeNum,
    int dropItemRefreshSource
) {
    public static SpaceAct_BeginDropItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_BeginDropItem(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static SpaceAct_BeginDropItem parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_BeginDropItem(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
