// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CellData_Normal(
    CellPartData_Base base,
    SpaceObjPartData_InstalledComp installedComps,
    CellCompData_Test compDataTest,
    CellCompData_ActionPlayer compDataActionPlayer,
    CellCompData_NpcRefresher compDataNpcRefresher,
    CellCompData_NpcInstantiator compDataNpcInstantiator,
    CellCompData_Db compDataDb,
    CellCompData_Catcher compDataCatcher,
    CellCompData_ActorManager compDataActorMgr,
    CellCompData_AssetBundle compDataAssetBundle,
    CellCompData_MfbtDebug compDataMfbtDebug,
    CellCompData_VisibleZoneMgr compDataVisibleZoneMgr,
    CellCompData_EffectDetector compDataDetector,
    CellCompData_VisibleCircle compDataVisibleCircle,
    CellCompData_MsgBroadcaster compDataBroadcaster,
    CellCompData_NormalizedPos compDataNormalizedPos,
    CellCompData_NpcFollowMgr compDataNpcFollowMgr,
    CellCompData_ActorInfoBuilder compDataActorInfoBuilder,
    CellCompData_DetectorAppender compDataDetectorAppender,
    CellCompData_IdleCellReclaimer compDataIdleCellReclaimer,
    CellCompData_HomeBasic compDataHomeBasic,
    CellCompData_HomePet compDataHomePet,
    CellCompData_HomePlant compDataHomePlant,
    CellCompData_HomeBrief compDataHomeBrief,
    CellCompData_Home compDataHome,
    CellCompData_InvokeRelay compDataInvokeRelay
) {
    public static CellData_Normal parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellData_Normal(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CellPartData_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.SpaceObjPartData_InstalledComp.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.CellCompData_Test.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.CellCompData_ActionPlayer.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.CellCompData_NpcRefresher.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.CellCompData_NpcInstantiator.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.CellCompData_Db.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.CellCompData_Catcher.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.CellCompData_ActorManager.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.CellCompData_AssetBundle.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.CellCompData_MfbtDebug.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.CellCompData_VisibleZoneMgr.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.CellCompData_EffectDetector.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 24) != null ? Next.pojo.CellCompData_VisibleCircle.parseFrom(Pojos.readMessage(fields, 24)) : null,
            Pojos.readMessage(fields, 25) != null ? Next.pojo.CellCompData_MsgBroadcaster.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readMessage(fields, 26) != null ? Next.pojo.CellCompData_NormalizedPos.parseFrom(Pojos.readMessage(fields, 26)) : null,
            Pojos.readMessage(fields, 27) != null ? Next.pojo.CellCompData_NpcFollowMgr.parseFrom(Pojos.readMessage(fields, 27)) : null,
            Pojos.readMessage(fields, 30) != null ? Next.pojo.CellCompData_ActorInfoBuilder.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readMessage(fields, 31) != null ? Next.pojo.CellCompData_DetectorAppender.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readMessage(fields, 32) != null ? Next.pojo.CellCompData_IdleCellReclaimer.parseFrom(Pojos.readMessage(fields, 32)) : null,
            Pojos.readMessage(fields, 40) != null ? Next.pojo.CellCompData_HomeBasic.parseFrom(Pojos.readMessage(fields, 40)) : null,
            Pojos.readMessage(fields, 41) != null ? Next.pojo.CellCompData_HomePet.parseFrom(Pojos.readMessage(fields, 41)) : null,
            Pojos.readMessage(fields, 42) != null ? Next.pojo.CellCompData_HomePlant.parseFrom(Pojos.readMessage(fields, 42)) : null,
            Pojos.readMessage(fields, 43) != null ? Next.pojo.CellCompData_HomeBrief.parseFrom(Pojos.readMessage(fields, 43)) : null,
            Pojos.readMessage(fields, 44) != null ? Next.pojo.CellCompData_Home.parseFrom(Pojos.readMessage(fields, 44)) : null,
            Pojos.readMessage(fields, 45) != null ? Next.pojo.CellCompData_InvokeRelay.parseFrom(Pojos.readMessage(fields, 45)) : null
        );
    }
    public static CellData_Normal parseFrom(java.util.List<ProtoField> fields) {
        return new CellData_Normal(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CellPartData_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.SpaceObjPartData_InstalledComp.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.CellCompData_Test.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.CellCompData_ActionPlayer.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.CellCompData_NpcRefresher.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.CellCompData_NpcInstantiator.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.CellCompData_Db.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.CellCompData_Catcher.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.CellCompData_ActorManager.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.CellCompData_AssetBundle.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.CellCompData_MfbtDebug.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.CellCompData_VisibleZoneMgr.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.CellCompData_EffectDetector.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 24) != null ? Next.pojo.CellCompData_VisibleCircle.parseFrom(Pojos.readMessage(fields, 24)) : null,
            Pojos.readMessage(fields, 25) != null ? Next.pojo.CellCompData_MsgBroadcaster.parseFrom(Pojos.readMessage(fields, 25)) : null,
            Pojos.readMessage(fields, 26) != null ? Next.pojo.CellCompData_NormalizedPos.parseFrom(Pojos.readMessage(fields, 26)) : null,
            Pojos.readMessage(fields, 27) != null ? Next.pojo.CellCompData_NpcFollowMgr.parseFrom(Pojos.readMessage(fields, 27)) : null,
            Pojos.readMessage(fields, 30) != null ? Next.pojo.CellCompData_ActorInfoBuilder.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readMessage(fields, 31) != null ? Next.pojo.CellCompData_DetectorAppender.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readMessage(fields, 32) != null ? Next.pojo.CellCompData_IdleCellReclaimer.parseFrom(Pojos.readMessage(fields, 32)) : null,
            Pojos.readMessage(fields, 40) != null ? Next.pojo.CellCompData_HomeBasic.parseFrom(Pojos.readMessage(fields, 40)) : null,
            Pojos.readMessage(fields, 41) != null ? Next.pojo.CellCompData_HomePet.parseFrom(Pojos.readMessage(fields, 41)) : null,
            Pojos.readMessage(fields, 42) != null ? Next.pojo.CellCompData_HomePlant.parseFrom(Pojos.readMessage(fields, 42)) : null,
            Pojos.readMessage(fields, 43) != null ? Next.pojo.CellCompData_HomeBrief.parseFrom(Pojos.readMessage(fields, 43)) : null,
            Pojos.readMessage(fields, 44) != null ? Next.pojo.CellCompData_Home.parseFrom(Pojos.readMessage(fields, 44)) : null,
            Pojos.readMessage(fields, 45) != null ? Next.pojo.CellCompData_InvokeRelay.parseFrom(Pojos.readMessage(fields, 45)) : null
        );
    }
}
