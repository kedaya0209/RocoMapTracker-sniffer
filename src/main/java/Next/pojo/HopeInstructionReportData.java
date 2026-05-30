// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HopeInstructionReportData(
    byte[] openid,
    byte[] ruleName,
    byte[] instructionTraceId,
    int execTime
) {
    public static HopeInstructionReportData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HopeInstructionReportData(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static HopeInstructionReportData parseFrom(java.util.List<ProtoField> fields) {
        return new HopeInstructionReportData(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
