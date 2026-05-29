// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record OwlContentMetaData(
    int owlSanctuaryContentNpcCfgId,
    int owlSanctuaryContentCfgId,
    boolean isOwlSanctuaryContentAdvantage,
    int owlSanctuaryContentAreaId,
    int owlSanctuaryRefreshMaxNum,
    int owlSanctuaryRefreshStorageNum
) {
    public static OwlContentMetaData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlContentMetaData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static OwlContentMetaData parseFrom(java.util.List<ProtoField> fields) {
        return new OwlContentMetaData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
