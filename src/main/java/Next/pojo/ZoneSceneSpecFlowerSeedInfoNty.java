// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneSpecFlowerSeedInfoNty(
    BossNpcInfos flowers
) {
    public static ZoneSceneSpecFlowerSeedInfoNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSpecFlowerSeedInfoNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneSpecFlowerSeedInfoNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSpecFlowerSeedInfoNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BossNpcInfos.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
