// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellCompData_HomePet(
    List<FurnitureCD> furnitureCd,
    List<HomePetRewardCache> rewardCaches,
    int fetchHomePetAwardCnt,
    long nextEggTime,
    int layEggMissCnt,
    List<HighValuePetLayEggRecord> highValuePetLayRecords
) {
    public static CellCompData_HomePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellCompData_HomePet(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FurnitureCD::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HomePetRewardCache::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.HighValuePetLayEggRecord::parseFrom).toList()
        );
    }
    public static CellCompData_HomePet parseFrom(java.util.List<ProtoField> fields) {
        return new CellCompData_HomePet(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FurnitureCD::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HomePetRewardCache::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.HighValuePetLayEggRecord::parseFrom).toList()
        );
    }
}
