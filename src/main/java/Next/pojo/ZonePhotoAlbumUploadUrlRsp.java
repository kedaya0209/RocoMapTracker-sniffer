// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePhotoAlbumUploadUrlRsp(
    RetInfo retInfo,
    String url,
    String photoName,
    int albumType,
    BanInfo banInfo
) {
    public static ZonePhotoAlbumUploadUrlRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumUploadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZonePhotoAlbumUploadUrlRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumUploadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
