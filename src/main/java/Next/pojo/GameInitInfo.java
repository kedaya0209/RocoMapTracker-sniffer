// Generated from game_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GameInitInfo(
    long gameId,
    int randomSeed,
    int frameRate,
    int startTime,
    int endTime,
    HostInfo hostInfo,
    long voipId,
    List<HostInfo> aiHostingHostList,
    int roomId
) {
    public static GameInitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GameInitInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.HostInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.HostInfo::parseFrom).toList(),
            Pojos.readInt(fields, 9)
        );
    }
    public static GameInitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GameInitInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.HostInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.HostInfo::parseFrom).toList(),
            Pojos.readInt(fields, 9)
        );
    }
}
