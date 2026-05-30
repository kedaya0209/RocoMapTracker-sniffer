@echo off
REM 上传本地构建的 rmt.db（含图标）到 GitHub Release
REM 用法: upload_db.bat <版本号>
REM 示例: upload_db.bat 1.0.0

if "%1"=="" (
    echo 用法: upload_db.bat ^<版本号^>
    echo 示例: upload_db.bat 1.0.0
    exit /b 1
)

set "RAW=%1"
set "RAW=%RAW:v=%"
set "TAG=v%RAW%"

if not exist "%~dp0..\rmt.db" (
    echo 错误: 找不到 rmt.db，请先运行 python build_db.py
    exit /b 1
)

echo 上传 rmt.db 到 %TAG% ...
gh release upload "%TAG%" "%~dp0..\rmt.db" --repo kedaya0209/RocoMapTracker-sniffer --clobber

if %errorlevel% equ 0 (
    echo 上传成功！
) else (
    echo 上传失败，请检查：1) 版本号是否正确 2) gh 是否已登录
)
