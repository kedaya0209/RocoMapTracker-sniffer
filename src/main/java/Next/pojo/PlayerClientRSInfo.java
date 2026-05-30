// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerClientRSInfo(
    List<ClientRemoteStorageData> clientRsDataList
) {
    public static PlayerClientRSInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerClientRSInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ClientRemoteStorageData::parseFrom).toList()
        );
    }
    public static PlayerClientRSInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerClientRSInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ClientRemoteStorageData::parseFrom).toList()
        );
    }
}
