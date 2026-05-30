// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomePetFeedInfo(
    HomePetFoodInfo foodInfo,
    long beginTime,
    long timeCost
) {
    public static HomePetFeedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetFeedInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetFoodInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static HomePetFeedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetFeedInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetFoodInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
