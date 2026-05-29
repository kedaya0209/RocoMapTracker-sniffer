// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DataLeaseInfo_Lease(
    long leaseInstanceId,
    long leaseVersion,
    long leaseLastSyncTime
) {
    public static DataLeaseInfo_Lease parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DataLeaseInfo_Lease(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static DataLeaseInfo_Lease parseFrom(java.util.List<ProtoField> fields) {
        return new DataLeaseInfo_Lease(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
