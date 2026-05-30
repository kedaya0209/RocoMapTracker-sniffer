// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneNpcNextActRsp(
    List<Integer> failDungeonRet,
    RetInfo retInfo,
    List<InteractActResult> actResults,
    List<InteractCommitResult> commitResults
) {
    public static ZoneSceneNpcNextActRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNpcNextActRsp(
            Pojos.readIntList(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InteractActResult::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.InteractCommitResult::parseFrom).toList()
        );
    }
    public static ZoneSceneNpcNextActRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNpcNextActRsp(
            Pojos.readIntList(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InteractActResult::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.InteractCommitResult::parseFrom).toList()
        );
    }
}
