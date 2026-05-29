// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ContentMetaData(
    int firstNpcKilledTime,
    int prevNpcKilledTime,
    int lastStorageResetTime,
    int remainStorage,
    int lastRefreshTime,
    int lastDeleteTime,
    int excuting,
    long sceneId,
    int reason,
    int uniqueId,
    int version,
    int refreshSource,
    long randRefreshIngameTime,
    boolean randRefreshedToday,
    OwlContentMetaData owlData
) {
    public static ContentMetaData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ContentMetaData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 21),
            Pojos.readBool(fields, 22),
            Pojos.readMessage(fields, 23) != null ? Next.pojo.OwlContentMetaData.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
    public static ContentMetaData parseFrom(java.util.List<ProtoField> fields) {
        return new ContentMetaData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 21),
            Pojos.readBool(fields, 22),
            Pojos.readMessage(fields, 23) != null ? Next.pojo.OwlContentMetaData.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
}
