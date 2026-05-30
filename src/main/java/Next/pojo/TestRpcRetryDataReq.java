// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TestRpcRetryDataReq(
    String reqData
) {
    public static TestRpcRetryDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TestRpcRetryDataReq(
            Pojos.readString(fields, 1)
        );
    }
    public static TestRpcRetryDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new TestRpcRetryDataReq(
            Pojos.readString(fields, 1)
        );
    }
}
