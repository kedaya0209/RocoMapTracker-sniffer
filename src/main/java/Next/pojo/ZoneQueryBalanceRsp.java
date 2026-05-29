// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryBalanceRsp(
    RetInfo retInfo,
    MidasMoneyInfo moneyInfo
) {
    public static ZoneQueryBalanceRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryBalanceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MidasMoneyInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneQueryBalanceRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryBalanceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MidasMoneyInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
