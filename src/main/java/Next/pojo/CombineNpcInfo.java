// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CombineNpcInfo(
    long combineId,
    int remainResultTimes,
    long addTime,
    int totalFinishedTimes,
    List<CombineNpcCondInfo> condInfo,
    boolean isCompleted,
    List<CombincNpcResultInfo> resultInfo,
    boolean isKeep,
    int version
) {
    public static CombineNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CombineNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.CombineNpcCondInfo::parseFrom).toList(),
            Pojos.readBool(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.CombincNpcResultInfo::parseFrom).toList(),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static CombineNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CombineNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.CombineNpcCondInfo::parseFrom).toList(),
            Pojos.readBool(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.CombincNpcResultInfo::parseFrom).toList(),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
