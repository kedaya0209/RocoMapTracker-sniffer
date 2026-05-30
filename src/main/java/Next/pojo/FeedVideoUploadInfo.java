// Generated from feed_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FeedVideoUploadInfo(
    List<FileUploadInfo> fileList,
    List<FileUploadInfo> expiredFileList
) {
    public static FeedVideoUploadInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FeedVideoUploadInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FileUploadInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FileUploadInfo::parseFrom).toList()
        );
    }
    public static FeedVideoUploadInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FeedVideoUploadInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FileUploadInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FileUploadInfo::parseFrom).toList()
        );
    }
}
