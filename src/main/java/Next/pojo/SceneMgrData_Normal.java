// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneMgrData_Normal(
    SpaceObjPartData_InstalledComp installedComps,
    SceneMgrCompData_AISubsystem compDataAiSubSystem,
    SceneMgrCompData_Teleporter compDataTeleporter,
    SceneMgrCompData_PreCreator compDataPreDataCreator,
    SceneMgrCompData_DotsMessenger compDataDotsMesseger,
    SceneMgrCompData_SvrInfoReportor compDataSvrInfoReportor,
    SceneMgrCompData_PlayActsCombine compDataPlayActsCombine
) {
    public static SceneMgrData_Normal parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneMgrData_Normal(
            Pojos.readMessage(fields, 10) != null ? Next.pojo.SpaceObjPartData_InstalledComp.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.SceneMgrCompData_AISubsystem.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.SceneMgrCompData_Teleporter.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.SceneMgrCompData_PreCreator.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.SceneMgrCompData_DotsMessenger.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.SceneMgrCompData_SvrInfoReportor.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.SceneMgrCompData_PlayActsCombine.parseFrom(Pojos.readMessage(fields, 19)) : null
        );
    }
    public static SceneMgrData_Normal parseFrom(java.util.List<ProtoField> fields) {
        return new SceneMgrData_Normal(
            Pojos.readMessage(fields, 10) != null ? Next.pojo.SpaceObjPartData_InstalledComp.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.SceneMgrCompData_AISubsystem.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.SceneMgrCompData_Teleporter.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.SceneMgrCompData_PreCreator.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.SceneMgrCompData_DotsMessenger.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.SceneMgrCompData_SvrInfoReportor.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 19) != null ? Next.pojo.SceneMgrCompData_PlayActsCombine.parseFrom(Pojos.readMessage(fields, 19)) : null
        );
    }
}
