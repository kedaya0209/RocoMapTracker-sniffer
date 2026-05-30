// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_EndDropItem(
    long srcNpcId,
    Position srcNpcPos,
    int srcNpcCfgId,
    int srcNpcRefCfgId,
    long batchNum
) {
    public static SpaceAct_EndDropItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_EndDropItem(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 2)
        );
    }
    public static SpaceAct_EndDropItem parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_EndDropItem(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 2)
        );
    }
}
