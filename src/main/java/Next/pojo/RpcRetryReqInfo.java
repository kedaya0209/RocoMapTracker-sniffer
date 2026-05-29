// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RpcRetryReqInfo(
    long reqId,
    String serviceName,
    int methodId,
    byte[] reqData
) {
    public static RpcRetryReqInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RpcRetryReqInfo(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
    public static RpcRetryReqInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RpcRetryReqInfo(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
}
