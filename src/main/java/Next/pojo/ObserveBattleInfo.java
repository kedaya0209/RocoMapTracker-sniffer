// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ObserveBattleInfo(
    boolean isObserver,
    List<ObserverBrief> observer,
    List<ObserverFashionInfo> observerAppearanceInfo
) {
    public static ObserveBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ObserveBattleInfo(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ObserverBrief::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ObserverFashionInfo::parseFrom).toList()
        );
    }
    public static ObserveBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ObserveBattleInfo(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ObserverBrief::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ObserverFashionInfo::parseFrom).toList()
        );
    }
}
