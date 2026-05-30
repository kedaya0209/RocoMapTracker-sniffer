// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SubscriptionBucketLease(
    long leaseDeadline
) {
    public static SubscriptionBucketLease parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SubscriptionBucketLease(
            Pojos.readLong(fields, 1)
        );
    }
    public static SubscriptionBucketLease parseFrom(java.util.List<ProtoField> fields) {
        return new SubscriptionBucketLease(
            Pojos.readLong(fields, 1)
        );
    }
}
