// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSelectBattlePassThemeReq(
    int themeId
) {
    public static ZoneSelectBattlePassThemeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectBattlePassThemeReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSelectBattlePassThemeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectBattlePassThemeReq(
            Pojos.readInt(fields, 1)
        );
    }
}
