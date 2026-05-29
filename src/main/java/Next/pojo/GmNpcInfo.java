// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GmNpcInfo(
    byte[] objId,
    int npcCfgId,
    byte[] npcDetailType,
    byte[] name,
    int contentCfgId,
    Position pos,
    boolean view,
    boolean advanceNpc,
    int weight,
    int distance
) {
    public static GmNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GmNpcInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static GmNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GmNpcInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
