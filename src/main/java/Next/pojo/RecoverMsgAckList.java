// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RecoverMsgAckList(
    List<RecoverMsgAckInfo> ackList,
    long lastUpdateTime,
    long lastSyncTime,
    TaskProgressData taskProgressData
) {
    public static RecoverMsgAckList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecoverMsgAckList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RecoverMsgAckInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.TaskProgressData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static RecoverMsgAckList parseFrom(java.util.List<ProtoField> fields) {
        return new RecoverMsgAckList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RecoverMsgAckInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.TaskProgressData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
