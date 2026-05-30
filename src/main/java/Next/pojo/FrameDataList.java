// Generated from game_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FrameDataList(
    List<FrameData> frameList
) {
    public static FrameDataList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FrameDataList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FrameData::parseFrom).toList()
        );
    }
    public static FrameDataList parseFrom(java.util.List<ProtoField> fields) {
        return new FrameDataList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FrameData::parseFrom).toList()
        );
    }
}
