// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePhotoAlbumDeleteReq(
    List<String> photoList
) {
    public static ZonePhotoAlbumDeleteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumDeleteReq(
            Pojos.readStringList(fields, 1)
        );
    }
    public static ZonePhotoAlbumDeleteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumDeleteReq(
            Pojos.readStringList(fields, 1)
        );
    }
}
