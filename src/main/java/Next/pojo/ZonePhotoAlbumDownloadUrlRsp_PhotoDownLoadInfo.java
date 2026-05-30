// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo(
    String photoName,
    String url
) {
    public static ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumDownloadUrlRsp_PhotoDownLoadInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
