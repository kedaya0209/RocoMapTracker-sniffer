// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_SceneRpcRetryMgr(
    RpcRetryInfo zonesvrRpcRetryData
) {
    public static ActorCompData_SceneRpcRetryMgr parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_SceneRpcRetryMgr(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RpcRetryInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorCompData_SceneRpcRetryMgr parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_SceneRpcRetryMgr(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RpcRetryInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
