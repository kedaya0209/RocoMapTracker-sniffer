// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SyncRpcRetryDataReq(
    List<RpcRetryReqInfo> rpcRetryReqInfo,
    long latestReqId,
    long oldestProcessingReqId,
    long latestProcessedReqId
) {
    public static SyncRpcRetryDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SyncRpcRetryDataReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RpcRetryReqInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static SyncRpcRetryDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new SyncRpcRetryDataReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RpcRetryReqInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
