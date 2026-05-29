// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePhotoAlbumPreviewRsp_PhotoFile(
    String photoName,
    String photoMd5
) {
    public static ZonePhotoAlbumPreviewRsp_PhotoFile parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumPreviewRsp_PhotoFile(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ZonePhotoAlbumPreviewRsp_PhotoFile parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumPreviewRsp_PhotoFile(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
