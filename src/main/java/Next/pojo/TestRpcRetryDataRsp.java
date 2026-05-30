// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TestRpcRetryDataRsp(
    String rspData
) {
    public static TestRpcRetryDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TestRpcRetryDataRsp(
            Pojos.readString(fields, 1)
        );
    }
    public static TestRpcRetryDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new TestRpcRetryDataRsp(
            Pojos.readString(fields, 1)
        );
    }
}
