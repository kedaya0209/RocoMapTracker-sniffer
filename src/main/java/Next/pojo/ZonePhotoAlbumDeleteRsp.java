// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePhotoAlbumDeleteRsp(
    RetInfo retInfo,
    List<String> photoList
) {
    public static ZonePhotoAlbumDeleteRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePhotoAlbumDeleteRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readStringList(fields, 2)
        );
    }
    public static ZonePhotoAlbumDeleteRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePhotoAlbumDeleteRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readStringList(fields, 2)
        );
    }
}
