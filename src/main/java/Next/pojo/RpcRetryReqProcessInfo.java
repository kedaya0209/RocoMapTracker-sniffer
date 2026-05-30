// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RpcRetryReqProcessInfo(
    long reqId,
    boolean processed
) {
    public static RpcRetryReqProcessInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RpcRetryReqProcessInfo(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static RpcRetryReqProcessInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RpcRetryReqProcessInfo(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
