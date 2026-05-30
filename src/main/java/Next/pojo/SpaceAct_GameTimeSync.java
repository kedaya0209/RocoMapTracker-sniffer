// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_GameTimeSync(
    long actorId,
    long gameTime
) {
    public static SpaceAct_GameTimeSync parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_GameTimeSync(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static SpaceAct_GameTimeSync parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_GameTimeSync(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
