// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerShareFormInfo(
    List<ShareFormItem> shareFormItem,
    List<EvalutionGroupShareForm> evaluationShareFormInfo
) {
    public static PlayerShareFormInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerShareFormInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ShareFormItem::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.EvalutionGroupShareForm::parseFrom).toList()
        );
    }
    public static PlayerShareFormInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerShareFormInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ShareFormItem::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.EvalutionGroupShareForm::parseFrom).toList()
        );
    }
}
