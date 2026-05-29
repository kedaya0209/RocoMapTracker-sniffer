// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneScenePlayActsNotify(
    List<SpaceActionCollection> acts,
    SpaceActionTags actTags,
    SpaceBaseData spaceBaseData
) {
    public static ZoneScenePlayActsNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePlayActsNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SpaceActionCollection::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceActionTags.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SpaceBaseData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneScenePlayActsNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePlayActsNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SpaceActionCollection::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceActionTags.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SpaceBaseData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
