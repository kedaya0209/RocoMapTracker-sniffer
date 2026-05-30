// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_SceneDotsComponentSync(
    long npcId,
    List<BytesData> componentDatas
) {
    public static SpaceAct_SceneDotsComponentSync parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_SceneDotsComponentSync(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BytesData::parseFrom).toList()
        );
    }
    public static SpaceAct_SceneDotsComponentSync parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_SceneDotsComponentSync(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BytesData::parseFrom).toList()
        );
    }
}
