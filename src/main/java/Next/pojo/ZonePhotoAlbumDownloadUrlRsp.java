// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePhotoAlbumDownloadUrlRsp(
    RetInfo retInfo,
    List<ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo> downloadList
) {
    public static ZonePhotoAlbumDownloadUrlRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumDownloadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo::parseFrom).toList()
        );
    }
    public static ZonePhotoAlbumDownloadUrlRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumDownloadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo::parseFrom).toList()
        );
    }
}
