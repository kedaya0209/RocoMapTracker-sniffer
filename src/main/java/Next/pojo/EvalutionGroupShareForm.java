// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record EvalutionGroupShareForm(
    int evaluationGroup,
    int cardQuality
) {
    public static EvalutionGroupShareForm parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EvalutionGroupShareForm(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static EvalutionGroupShareForm parseFrom(java.util.List<ProtoField> fields) {
        return new EvalutionGroupShareForm(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
