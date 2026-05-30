// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Test(
    int int32Val,
    long int64Val,
    List<Integer> int32ArrVal,
    String strVal1,
    String strVal2,
    List<String> strArrVal1,
    List<String> strArrVal2,
    long test1,
    long test2,
    long test3
) {
    public static ActorCompData_Test parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Test(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readStringList(fields, 6),
            Pojos.readStringList(fields, 7),
            Pojos.readLong(fields, 80),
            Pojos.readLong(fields, 81),
            Pojos.readLong(fields, 82)
        );
    }
    public static ActorCompData_Test parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Test(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readStringList(fields, 6),
            Pojos.readStringList(fields, 7),
            Pojos.readLong(fields, 80),
            Pojos.readLong(fields, 81),
            Pojos.readLong(fields, 82)
        );
    }
}
