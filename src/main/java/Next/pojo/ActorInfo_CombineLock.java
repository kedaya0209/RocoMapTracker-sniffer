// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_CombineLock(
    int unlockedNum,
    int totLockNum,
    List<CombineCondNpcInfo> condNpcInfos
) {
    public static ActorInfo_CombineLock parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_CombineLock(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CombineCondNpcInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_CombineLock parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_CombineLock(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CombineCondNpcInfo::parseFrom).toList()
        );
    }
}
