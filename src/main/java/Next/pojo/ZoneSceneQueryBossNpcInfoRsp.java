// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneQueryBossNpcInfoRsp(
    RetInfo retInfo,
    BossNpcInfos flowerNpcs,
    BossNpcInfos worldLeaderNpcs,
    BossNpcInfos legendaryNpcs
) {
    public static ZoneSceneQueryBossNpcInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneQueryBossNpcInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneSceneQueryBossNpcInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneQueryBossNpcInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
