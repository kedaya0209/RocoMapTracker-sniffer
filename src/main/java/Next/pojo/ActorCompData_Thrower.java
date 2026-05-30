// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Thrower(
    List<ThrowPetInfo> throwPetInfo,
    List<BeginThrowInfo> beginThrowInfo,
    long maxThrowId,
    List<ThrowingMagicInfo> throwingMagicInfo,
    List<ThrowedBagItemInfo> bagitemInfosThrownInVisiting,
    List<Integer> waitPetInteractGids,
    ThrowSeatInfo throwSeatInfo
) {
    public static ActorCompData_Thrower parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Thrower(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ThrowPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BeginThrowInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ThrowingMagicInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ThrowedBagItemInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ThrowSeatInfo.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static ActorCompData_Thrower parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Thrower(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ThrowPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BeginThrowInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ThrowingMagicInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ThrowedBagItemInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.ThrowSeatInfo.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
