// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePhotoAlbumUploadUrlReq(
    int albumType,
    String photoName
) {
    public static ZonePhotoAlbumUploadUrlReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumUploadUrlReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ZonePhotoAlbumUploadUrlReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumUploadUrlReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
