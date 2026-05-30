"""生成 sniffer 插件 metadata.json

用法: python gen_metadata.py <版本号> <插件目录>
示例: python gen_metadata.py 1.0.0 sniffer/
"""
import hashlib
import json
import os
import sys


def sha256_file(path: str) -> str:
    sha = hashlib.sha256()
    with open(path, 'rb') as fp:
        while True:
            buf = fp.read(65536)
            if not buf:
                break
            sha.update(buf)
    return sha.hexdigest()


def main():
    if len(sys.argv) < 3:
        print("usage: python gen_metadata.py <version> <plugin_dir>", file=sys.stderr)
        sys.exit(1)

    version = sys.argv[1]
    pkg_dir = sys.argv[2]

    assets = []
    for f in ['RocoMapTracker-sniffer.exe', 'rmt.db']:
        path = os.path.join(pkg_dir, f)
        if os.path.isfile(path):
            sha = sha256_file(path)
            assets.append({
                'remoteName': f,
                'localPath': f,
                'sha256': sha,
            })
            print(f'{f}: {sha}')

    meta = {
        'name': 'sniffer',
        'title': '抓包桥接器',
        'version': version,
        'description': '高级版内置组件,默认启用',
        'icon': 'rmt.svg',
        'entry': 'RocoMapTracker-sniffer.exe',
        'source': {
            'type': 'github-release',
            'repo': 'kedaya0209/RocoMapTracker-sniffer',
        },
        'assets': assets,
    }

    out_path = os.path.join(pkg_dir, 'metadata.json')
    with open(out_path, 'w') as fp:
        json.dump(meta, fp, indent=2)
    print(f'metadata.json generated: {out_path}')
    print(json.dumps(meta, indent=2))


if __name__ == '__main__':
    main()
