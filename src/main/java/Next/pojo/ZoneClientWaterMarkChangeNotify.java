// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientWaterMarkChangeNotify(
    PlayerClientWaterMarkInfo clientWaterMarkInfo
) {
    public static ZoneClientWaterMarkChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientWaterMarkChangeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerClientWaterMarkInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneClientWaterMarkChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientWaterMarkChangeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerClientWaterMarkInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
