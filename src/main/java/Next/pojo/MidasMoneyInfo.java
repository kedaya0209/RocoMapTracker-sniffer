// Generated from com_recharge.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MidasMoneyInfo(
    int lastRechargePointsNum,
    long lastRechargePointsTime,
    long midasBalance,
    long midasSaveAmt,
    MidasFailRetryPresentList failDataNouse,
    long outGameBuyNum,
    ChargeInfoList chargeData,
    long lastUpdateTime,
    long freeBalance,
    long useChargePointsNum,
    long payPointsNum,
    long lastChargeMoneyNum,
    long lastChargeTime,
    long lastUsechargeMoneyNum,
    long lastUsechargeTime,
    long gid,
    long midasGenSaveAmt,
    long distributeAmt,
    long totalTestAmt,
    boolean isCalcTestAmt,
    MidasFailRetryList failData,
    int lastTryTime
) {
    public static MidasMoneyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasMoneyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.MidasFailRetryPresentList.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ChargeInfoList.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readLong(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readLong(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readLong(fields, 20),
            Pojos.readLong(fields, 21),
            Pojos.readLong(fields, 22),
            Pojos.readLong(fields, 23),
            Pojos.readBool(fields, 24),
            Pojos.readMessage(fields, 25) != null ? Next.pojo.MidasFailRetryList.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readInt(fields, 26)
        );
    }
    public static MidasMoneyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MidasMoneyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.MidasFailRetryPresentList.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ChargeInfoList.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readLong(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readLong(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readLong(fields, 20),
            Pojos.readLong(fields, 21),
            Pojos.readLong(fields, 22),
            Pojos.readLong(fields, 23),
            Pojos.readBool(fields, 24),
            Pojos.readMessage(fields, 25) != null ? Next.pojo.MidasFailRetryList.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readInt(fields, 26)
        );
    }
}
