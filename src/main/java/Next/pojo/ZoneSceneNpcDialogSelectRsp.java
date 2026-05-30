// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneNpcDialogSelectRsp(
    RetInfo retInfo,
    List<InteractActResult> actResults,
    List<InteractCommitResult> commitResults
) {
    public static ZoneSceneNpcDialogSelectRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNpcDialogSelectRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.InteractActResult::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InteractCommitResult::parseFrom).toList()
        );
    }
    public static ZoneSceneNpcDialogSelectRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNpcDialogSelectRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.InteractActResult::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.InteractCommitResult::parseFrom).toList()
        );
    }
}
