// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientDevInfo(
    byte[] deviceInfo,
    int platId,
    byte[] systemSoftware,
    byte[] systemHardware,
    byte[] telecomOper,
    byte[] network,
    int screenWidth,
    int screenHight,
    byte[] density,
    byte[] channel,
    byte[] cpuHardware,
    byte[] memory,
    byte[] glRender,
    byte[] glVersion,
    byte[] deviceId,
    byte[] language,
    int ping,
    byte[] area,
    byte[] appstore,
    byte[] packageChannel,
    byte[] aid,
    byte[] userAgent,
    byte[] oldCaid,
    int isGamematrix
) {
    public static ClientDevInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientDevInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readBytes(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readBytes(fields, 12),
            Pojos.readBytes(fields, 13),
            Pojos.readBytes(fields, 14),
            Pojos.readBytes(fields, 15),
            Pojos.readBytes(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readBytes(fields, 18),
            Pojos.readBytes(fields, 19),
            Pojos.readBytes(fields, 20),
            Pojos.readBytes(fields, 21),
            Pojos.readBytes(fields, 22),
            Pojos.readBytes(fields, 23),
            Pojos.readInt(fields, 24)
        );
    }
    public static ClientDevInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ClientDevInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readBytes(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readBytes(fields, 12),
            Pojos.readBytes(fields, 13),
            Pojos.readBytes(fields, 14),
            Pojos.readBytes(fields, 15),
            Pojos.readBytes(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readBytes(fields, 18),
            Pojos.readBytes(fields, 19),
            Pojos.readBytes(fields, 20),
            Pojos.readBytes(fields, 21),
            Pojos.readBytes(fields, 22),
            Pojos.readBytes(fields, 23),
            Pojos.readInt(fields, 24)
        );
    }
}
