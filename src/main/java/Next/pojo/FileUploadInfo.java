// Generated from feed_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FileUploadInfo(
    String fileName,
    int uploadTimestamp,
    int expireTimestamp,
    Position createPos,
    String content,
    String uploadUrl
) {
    public static FileUploadInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FileUploadInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
    public static FileUploadInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FileUploadInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6)
        );
    }
}
