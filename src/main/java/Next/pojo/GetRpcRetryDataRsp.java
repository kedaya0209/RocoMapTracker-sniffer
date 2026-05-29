// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GetRpcRetryDataRsp(
    List<RpcRetryReqInfo> rpcRetryReqInfo
) {
    public static GetRpcRetryDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GetRpcRetryDataRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RpcRetryReqInfo::parseFrom).toList()
        );
    }
    public static GetRpcRetryDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new GetRpcRetryDataRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RpcRetryReqInfo::parseFrom).toList()
        );
    }
}
