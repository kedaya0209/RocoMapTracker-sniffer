// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTryInstantiateNpcReq(
    int contentCfgId,
    long npcObjid,
    int taskid,
    int traceidx
) {
    public static ZoneTryInstantiateNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTryInstantiateNpcReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneTryInstantiateNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTryInstantiateNpcReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
