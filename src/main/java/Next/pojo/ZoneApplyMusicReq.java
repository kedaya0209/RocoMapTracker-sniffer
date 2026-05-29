// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneApplyMusicReq(
    MusicApplyInfo applyInfo
) {
    public static ZoneApplyMusicReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneApplyMusicReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.MusicApplyInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneApplyMusicReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneApplyMusicReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.MusicApplyInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
