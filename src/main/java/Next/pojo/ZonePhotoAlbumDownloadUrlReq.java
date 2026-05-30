// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePhotoAlbumDownloadUrlReq(
    List<String> photoList
) {
    public static ZonePhotoAlbumDownloadUrlReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumDownloadUrlReq(
            Pojos.readStringList(fields, 1)
        );
    }
    public static ZonePhotoAlbumDownloadUrlReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumDownloadUrlReq(
            Pojos.readStringList(fields, 1)
        );
    }
}
