// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_HomeBasicInfo(
    HomeInfo myHomeInfo,
    HomeInfo targetHomeInfo,
    int reason
) {
    public static ActorInfo_HomeBasicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_HomeBasicInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ActorInfo_HomeBasicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_HomeBasicInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomeInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0)
        );
    }
}
