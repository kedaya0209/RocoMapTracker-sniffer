// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePhotoAlbumUploadSuccessReq(
    String photoName,
    String photoMd5
) {
    public static ZonePhotoAlbumUploadSuccessReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumUploadSuccessReq(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ZonePhotoAlbumUploadSuccessReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumUploadSuccessReq(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
