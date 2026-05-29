// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SyncRpcRetryDataRsp(
    long oldestProcessingReqId
) {
    public static SyncRpcRetryDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SyncRpcRetryDataRsp(
            Pojos.readLong(fields, 1)
        );
    }
    public static SyncRpcRetryDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new SyncRpcRetryDataRsp(
            Pojos.readLong(fields, 1)
        );
    }
}
