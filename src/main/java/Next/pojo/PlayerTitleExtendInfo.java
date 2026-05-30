// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerTitleExtendInfo(
    PlayerTitleLBSInfo lbsInfo,
    int effectBeginTime
) {
    public static PlayerTitleExtendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTitleExtendInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerTitleLBSInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerTitleExtendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTitleExtendInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerTitleLBSInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
