// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RecoverMsgAckInfo(
    int type,
    long ack,
    List<RecoverMsgInfo> recoverMsgList,
    long finishGid
) {
    public static RecoverMsgAckInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecoverMsgAckInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RecoverMsgInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5)
        );
    }
    public static RecoverMsgAckInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RecoverMsgAckInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RecoverMsgInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5)
        );
    }
}
