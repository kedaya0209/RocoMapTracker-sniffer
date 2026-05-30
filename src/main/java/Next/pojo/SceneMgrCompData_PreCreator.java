// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneMgrCompData_PreCreator(
    int dataBaseId
) {
    public static SceneMgrCompData_PreCreator parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneMgrCompData_PreCreator(
            Pojos.readInt(fields, 1)
        );
    }
    public static SceneMgrCompData_PreCreator parseFrom(java.util.List<ProtoField> fields) {
        return new SceneMgrCompData_PreCreator(
            Pojos.readInt(fields, 1)
        );
    }
}
