// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcInteractor(
    List<NpcOptionData> optionDatas,
    boolean resetAfterInteract,
    boolean delNpcAfterInteract,
    List<Integer> pendDelNpcOptionIds,
    List<VisitorOnly_NpcOptionData> visitorOnlyOptionDatas,
    boolean isSpecityEffect,
    PetCombineInteractData combineInteractData,
    List<Integer> delOptions,
    List<SeatNpcSitData> seatDatas,
    int delNpcAfterInteractReason
) {
    public static ActorCompData_NpcInteractor parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcInteractor(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcOptionData::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.VisitorOnly_NpcOptionData::parseFrom).toList(),
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PetCombineInteractData.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readIntList(fields, 14),
            Pojos.readMessageList(fields, 15).stream().map(Next.pojo.SeatNpcSitData::parseFrom).toList(),
            Pojos.readInt(fields, 16)
        );
    }
    public static ActorCompData_NpcInteractor parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcInteractor(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcOptionData::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.VisitorOnly_NpcOptionData::parseFrom).toList(),
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PetCombineInteractData.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readIntList(fields, 14),
            Pojos.readMessageList(fields, 15).stream().map(Next.pojo.SeatNpcSitData::parseFrom).toList(),
            Pojos.readInt(fields, 16)
        );
    }
}
