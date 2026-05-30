// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneEndThrowRsp(
    RetInfo retInfo,
    ThrowBagItemResult throwBagitemResult,
    ZoneCatchResult catchResult,
    List<ThrowRandomActionInfo> randomResult,
    ThrowPetResult throwPetResult,
    ThrowMagicCreateNPCResult throwMagicCreateNpcResult
) {
    public static ZoneSceneEndThrowRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneEndThrowRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ThrowBagItemResult.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.ZoneCatchResult.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.ThrowRandomActionInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ThrowPetResult.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ThrowMagicCreateNPCResult.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
    public static ZoneSceneEndThrowRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneEndThrowRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ThrowBagItemResult.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.ZoneCatchResult.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.ThrowRandomActionInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ThrowPetResult.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ThrowMagicCreateNPCResult.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
}
