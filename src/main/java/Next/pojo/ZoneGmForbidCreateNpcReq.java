// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmForbidCreateNpcReq(
    int uin
) {
    public static ZoneGmForbidCreateNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmForbidCreateNpcReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmForbidCreateNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmForbidCreateNpcReq(
            Pojos.readInt(fields, 1)
        );
    }
}
