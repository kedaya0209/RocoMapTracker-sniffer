// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GetRpcRetryDataReq(
    long latestReqId
) {
    public static GetRpcRetryDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GetRpcRetryDataReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static GetRpcRetryDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new GetRpcRetryDataReq(
            Pojos.readLong(fields, 1)
        );
    }
}
