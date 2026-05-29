// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePhotoAlbumPreviewRsp(
    RetInfo retInfo,
    List<ZonePhotoAlbumPreviewRsp_PhotoFile> photoList
) {
    public static ZonePhotoAlbumPreviewRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumPreviewRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePhotoAlbumPreviewRsp_PhotoFile::parseFrom).toList()
        );
    }
    public static ZonePhotoAlbumPreviewRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumPreviewRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePhotoAlbumPreviewRsp_PhotoFile::parseFrom).toList()
        );
    }
}
