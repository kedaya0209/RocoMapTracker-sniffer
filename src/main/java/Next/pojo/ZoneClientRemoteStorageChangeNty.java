// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneClientRemoteStorageChangeNty(
    List<String> delKeys,
    List<ClientRemoteStorageData> updateRsDatas
) {
    public static ZoneClientRemoteStorageChangeNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientRemoteStorageChangeNty(
            Pojos.readStringList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ClientRemoteStorageData::parseFrom).toList()
        );
    }
    public static ZoneClientRemoteStorageChangeNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientRemoteStorageChangeNty(
            Pojos.readStringList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ClientRemoteStorageData::parseFrom).toList()
        );
    }
}
