// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FeedVideoInfo(
    String fileName,
    String fileUrl,
    String fileMd5,
    String baseInfoMd5
) {
    public static FeedVideoInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FeedVideoInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
    public static FeedVideoInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FeedVideoInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
}
