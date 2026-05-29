"""从 UE 导出资源中提取图标，存入 data/icons/{table_name}/{id}.png。

支持两种来源：
  1. 纹理图集（Atlas）：BuffIcon 等，用 PaperSprite JSON 偏移量裁切
  2. 独立 PNG：BagItem、SkillIcon 等，直接复制并按 JSON ID 重命名

用法：python extract_icons.py
"""
import json
import re
import shutil
from pathlib import Path

try:
    from PIL import Image
except ImportError:
    print("需要 Pillow: pip install Pillow")
    exit(1)

# UE 资源导出根目录
UE_ROOT = Path(r"D:\Documents\unpack\Output\Exports\NRC\Content\NewRoco\Modules\System")

# 配置：(ue子目录, 输出表名, 模式)
# 模式: "atlas" = 纹理图集裁切, "files" = 独立PNG复制
ICON_SOURCES = [
    ("Common/Icon/BuffIcon",            "buff",     "atlas"),
    ("Common/Icon/BagItem",             "bag_item", "files"),
    ("BattleUI/Raw/Atlas/SkillIcon",    "skill",    "files"),
    ("BattleUI/Raw/Atlas/FeatureIcon",  "skill",    "files"),
]
PET_ICON_DIRS = [
    "Common/Icon/BigHeadIcon256",
    "Common/Icon/BossMapHeadIcon",
    "Common/Icon/HeadIcon",
    "Common/Icon/Pet1024",
    "Common/Icon/Pet256",
    "Friend/Raw/HeadPortrait",
    "Friend/Raw/StudentCard",
]

OUTPUT_DIR = Path(__file__).parent / "data" / "icons"


def extract_sprite(atlas: Image.Image, frame_json: Path) -> tuple[int, Image.Image] | None:
    """从 frame JSON 中读取偏移量，从 atlas 裁切出单个图标。"""
    data = json.loads(frame_json.read_text(encoding="utf-8-sig"))

    sprite = None
    for entry in data:
        if entry.get("Type") == "PaperSprite":
            sprite = entry
            break
    if sprite is None:
        return None

    props = sprite.get("Properties", {})
    uv = props.get("BakedSourceUV", {})
    dim = props.get("BakedSourceDimension", {})

    x, y = int(uv.get("X", 0)), int(uv.get("Y", 0))
    w, h = int(dim.get("X", 0)), int(dim.get("Y", 0))

    if w <= 0 or h <= 0:
        return None

    stem = frame_json.stem  # "800001_png"
    m = re.match(r"(\d+)", stem)
    if not m:
        return None
    icon_id = int(m.group(1))

    cropped = atlas.crop((x, y, x + w, y + h))
    return icon_id, cropped


def process_atlas(ue_subdir: str, table_name: str):
    """处理纹理图集目录：裁切并保存。"""
    atlas_dir = UE_ROOT / ue_subdir
    textures_dir = atlas_dir / "Textures"
    frames_dir = atlas_dir / "Frames"

    if not textures_dir.is_dir() or not frames_dir.is_dir():
        print(f"[SKIP] {ue_subdir} — Textures 或 Frames 目录不存在")
        return

    pngs = list(textures_dir.glob("*.png"))
    if not pngs:
        print(f"[SKIP] {ue_subdir} — Textures 下没有 PNG")
        return
    atlas_path = pngs[0]
    atlas = Image.open(atlas_path)
    print(f"[ATLAS] {atlas_path.name}: {atlas.size[0]}x{atlas.size[1]}")

    out_dir = OUTPUT_DIR / table_name
    out_dir.mkdir(parents=True, exist_ok=True)

    count = 0
    for frame_json in sorted(frames_dir.glob("*.json")):
        result = extract_sprite(atlas, frame_json)
        if result is None:
            continue
        icon_id, icon = result
        icon.save(out_dir / f"{icon_id}.png")
        count += 1

    print(f"[OK] {table_name}: {count} 个图标 (atlas) → {out_dir}")


def process_files(ue_subdir: str, table_name: str):
    """处理独立 PNG 目录：按 JSON icon 字段中的文件名查找，按 ID 重命名复制。"""
    png_dir = UE_ROOT / ue_subdir
    if not png_dir.is_dir():
        print(f"[SKIP] {ue_subdir} — 目录不存在")
        return

    # 建立文件名→路径索引（不含扩展名）
    file_index: dict[str, Path] = {}
    for p in png_dir.glob("*.png"):
        file_index[p.stem] = p

    # 从对应 JSON 中读取 id → icon 映射
    json_map = {
        "bag_item": "BAG_ITEM_CONF.json",
        "skill": "SKILL_CONF.json",
        "buff": "BUFF_CONF.json",
    }
    json_file = json_map.get(table_name)
    if json_file is None:
        return

    json_path = Path(__file__).parent / "data" / json_file
    if not json_path.exists():
        print(f"[SKIP] {json_file} 不存在")
        return

    data = json.load(json_path.open(encoding="utf-8-sig"))
    rows = data.get("RocoDataRows", {})

    out_dir = OUTPUT_DIR / table_name
    out_dir.mkdir(parents=True, exist_ok=True)

    count = 0
    for row in rows.values():
        row_id = row.get("id")
        icon_path = row.get("icon", "")
        if not icon_path or row_id is None:
            continue

        # 提取文件名: Texture2D'.../BagItem/100101.100101' → "100101"
        m = re.search(r"/([^/]+)\.\1", icon_path)
        if not m:
            continue
        fname = m.group(1)

        src = file_index.get(fname)
        if src is None:
            continue

        dst = out_dir / f"{row_id}.png"
        if not dst.exists():
            shutil.copy2(src, dst)
            count += 1

    print(f"[OK] {table_name}: {count} 个图标 (files) → {out_dir}")


def process_pet(ue_subdirs: list[str]):
    """处理宠物头像：按 base_id 匹配，按 base_id 命名保存。
    搜索多个目录（BigHeadIcon256 + HeadIcon）。"""
    # base_id → 文件路径（多个目录合并，先找到的优先）
    file_index: dict[str, Path] = {}
    for sub in ue_subdirs:
        d = UE_ROOT / sub
        if not d.is_dir():
            continue
        for p in d.glob("*.png"):
            if p.stem not in file_index:
                file_index[p.stem] = p

    if not file_index:
        print(f"[SKIP] pet — 无图标文件")
        return

    json_path = Path(__file__).parent / "data" / "PET_CONF.json"
    data = json.load(json_path.open(encoding="utf-8-sig"))
    rows = data.get("RocoDataRows", {})

    out_dir = OUTPUT_DIR / "pet"
    out_dir.mkdir(parents=True, exist_ok=True)

    count = 0
    for row in rows.values():
        base_id = row.get("base_id")
        if base_id is None:
            continue
        src = file_index.get(str(base_id))
        if src is None:
            continue
        dst = out_dir / f"{base_id}.png"
        if not dst.exists():
            shutil.copy2(src, dst)
            count += 1

    print(f"[OK] pet: {count} 个图标 → {out_dir}")


def main():
    if OUTPUT_DIR.exists():
        shutil.rmtree(OUTPUT_DIR)

    for ue_subdir, table_name, mode in ICON_SOURCES:
        if mode == "atlas":
            process_atlas(ue_subdir, table_name)
        else:
            process_files(ue_subdir, table_name)

    process_pet(PET_ICON_DIRS)

    # 统计
    total = 0
    for d in sorted(OUTPUT_DIR.iterdir()):
        if d.is_dir():
            n = len(list(d.glob("*.png")))
            total += n
            print(f"  {d.name}: {n} 个")
    print(f"\n总计: {total} 个图标")


if __name__ == "__main__":
    main()
