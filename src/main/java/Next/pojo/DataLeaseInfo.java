// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DataLeaseInfo(
    int policy,
    DataLeaseInfo_Lease leaseToken,
    DataLeaseInfo_Lease leaseData
) {
    public static DataLeaseInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DataLeaseInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DataLeaseInfo_Lease.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DataLeaseInfo_Lease.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static DataLeaseInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DataLeaseInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DataLeaseInfo_Lease.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DataLeaseInfo_Lease.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
