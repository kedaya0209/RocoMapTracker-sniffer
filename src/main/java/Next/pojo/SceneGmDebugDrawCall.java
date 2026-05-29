// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneGmDebugDrawCall(
    int type,
    DebugDrawPointData pointData,
    DebugDrawLineData lineData,
    DebugDrawSphereData sphereData,
    DebugDrawBoxData boxData,
    DebugDrawCapsuleData capsuleData,
    DebugDrawMeshData meshData,
    DebugDrawWireFrameData wireFrameData,
    DebugDrawPointSetData pointSetData,
    DebugDrawNavMeshData navMeshData,
    DebugDrawCylinderData cylinderData,
    DebugDrawCircleData circleData,
    DebugDrawTextData textData
) {
    public static SceneGmDebugDrawCall parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneGmDebugDrawCall(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DebugDrawPointData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawLineData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawSphereData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawBoxData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.DebugDrawCapsuleData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.DebugDrawMeshData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.DebugDrawWireFrameData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DebugDrawPointSetData.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.DebugDrawNavMeshData.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.DebugDrawCylinderData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.DebugDrawCircleData.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.DebugDrawTextData.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
    public static SceneGmDebugDrawCall parseFrom(java.util.List<ProtoField> fields) {
        return new SceneGmDebugDrawCall(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DebugDrawPointData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.DebugDrawLineData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.DebugDrawSphereData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.DebugDrawBoxData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.DebugDrawCapsuleData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.DebugDrawMeshData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.DebugDrawWireFrameData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.DebugDrawPointSetData.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.DebugDrawNavMeshData.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.DebugDrawCylinderData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.DebugDrawCircleData.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.DebugDrawTextData.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
}
