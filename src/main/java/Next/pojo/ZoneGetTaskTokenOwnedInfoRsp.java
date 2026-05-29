// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetTaskTokenOwnedInfoRsp(
    RetInfo retInfo,
    List<ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData> taskTokenOwnedData
) {
    public static ZoneGetTaskTokenOwnedInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetTaskTokenOwnedInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData::parseFrom).toList()
        );
    }
    public static ZoneGetTaskTokenOwnedInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetTaskTokenOwnedInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData::parseFrom).toList()
        );
    }
}
