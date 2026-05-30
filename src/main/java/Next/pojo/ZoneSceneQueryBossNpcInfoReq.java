// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneQueryBossNpcInfoReq(
    int friendUin
) {
    public static ZoneSceneQueryBossNpcInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneQueryBossNpcInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneQueryBossNpcInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneQueryBossNpcInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
