// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RecoverMsgData(
    int type,
    long gid,
    long ack,
    List<RecoverMsgInfo> recoverMsgList,
    long lastUpdateTime,
    List<RecoverMsgInfo> bakRecoverMsgList,
    int finishGidOld,
    long lastSyncTime,
    long finishGid,
    long lastStatSyncTime,
    long lastEnterSceneTime,
    long lastScenesvrId,
    long lastAckTime,
    boolean haveNextSeqData
) {
    public static RecoverMsgData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecoverMsgData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RecoverMsgInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.RecoverMsgInfo::parseFrom).toList(),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14),
            Pojos.readBool(fields, 15)
        );
    }
    public static RecoverMsgData parseFrom(java.util.List<ProtoField> fields) {
        return new RecoverMsgData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RecoverMsgInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.RecoverMsgInfo::parseFrom).toList(),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14),
            Pojos.readBool(fields, 15)
        );
    }
}
