// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFuncBlockingConfsChangeNotify(
    List<FuncBlockingConfs> funcBlockingConfsList
) {
    public static ZoneFuncBlockingConfsChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFuncBlockingConfsChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FuncBlockingConfs::parseFrom).toList()
        );
    }
    public static ZoneFuncBlockingConfsChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFuncBlockingConfsChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FuncBlockingConfs::parseFrom).toList()
        );
    }
}
