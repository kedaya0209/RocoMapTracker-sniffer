// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneSysFuncBannedNotify(
    BanInfo banInfo
) {
    public static ZoneSceneSysFuncBannedNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSysFuncBannedNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneSysFuncBannedNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSysFuncBannedNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
