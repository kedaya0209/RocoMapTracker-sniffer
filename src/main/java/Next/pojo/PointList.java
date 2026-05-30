// Generated from client.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PointList(
    List<Point> points
) {
    public static PointList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PointList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Point::parseFrom).toList()
        );
    }
    public static PointList parseFrom(java.util.List<ProtoField> fields) {
        return new PointList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Point::parseFrom).toList()
        );
    }
}
