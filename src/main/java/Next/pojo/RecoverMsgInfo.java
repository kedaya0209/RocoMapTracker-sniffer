// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RecoverMsgInfo(
    long key1,
    long key2,
    long seq,
    int finish,
    int type,
    int isSceneAction,
    int tryTimes,
    long key3,
    RecoverMsgTaskInfo taskInfo,
    RecoverMsgTestInfo testInfo,
    RecoverMsgIdipInfo idipInfo
) {
    public static RecoverMsgInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecoverMsgInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.RecoverMsgTaskInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.RecoverMsgTestInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.RecoverMsgIdipInfo.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
    public static RecoverMsgInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RecoverMsgInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.RecoverMsgTaskInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.RecoverMsgTestInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.RecoverMsgIdipInfo.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
}
