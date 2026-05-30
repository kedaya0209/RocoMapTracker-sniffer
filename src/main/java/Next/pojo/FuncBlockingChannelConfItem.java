// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FuncBlockingChannelConfItem(
    int channelConfId,
    List<Integer> displayPlatform,
    List<String> pkgChannelHiddenList,
    List<String> pkgChannelShowList
) {
    public static FuncBlockingChannelConfItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FuncBlockingChannelConfItem(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readStringList(fields, 3),
            Pojos.readStringList(fields, 4)
        );
    }
    public static FuncBlockingChannelConfItem parseFrom(java.util.List<ProtoField> fields) {
        return new FuncBlockingChannelConfItem(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readStringList(fields, 3),
            Pojos.readStringList(fields, 4)
        );
    }
}
