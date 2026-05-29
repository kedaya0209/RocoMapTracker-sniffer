package com.roco.sniffer.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 游戏配置数据库：基于 SQLite 的 ID→数据 查询。
 * <p>
 * 数据库由 Python build_db.py 从 JSON 生成，打包在 classpath 的 game_data.db 中。
 */
@Slf4j
public class ConfigDb {

    // ── 场景数据库 ──

    public record SceneParams(double centerX, double centerY, double sideLength) {}

    public static class SceneDb {
        private static final Logger log = LoggerFactory.getLogger(SceneDb.class);
        private final Connection conn;
        private PreparedStatement stmt;

        public SceneDb(Connection conn) { this.conn = conn; }

        public boolean load() {
            try {
                stmt = conn.prepareStatement(
                        "SELECT s.scene_res_id, w.map_center_position_xyz, w.side_length " +
                        "FROM scene_conf s JOIN world_map_block w ON s.scene_res_id = w.scene_res_id " +
                        "WHERE s.id = ?");
                log.info("场景数据库已加载");
                return true;
            } catch (SQLException e) {
                log.warn("场景数据库加载失败: {}", e.getMessage());
                return false;
            }
        }

        public synchronized SceneParams lookup(int sceneCfgId) {
            if (stmt == null) return null;
            try {
                stmt.setInt(1, sceneCfgId);
                ResultSet rs = stmt.executeQuery();
                if (!rs.next()) return null;
                String centerStr = rs.getString("map_center_position_xyz");
                double sideLength = rs.getDouble("side_length");
                if (centerStr == null || centerStr.isEmpty()) return null;
                String[] parts = centerStr.split(";");
                if (parts.length < 2) return null;
                try {
                    return new SceneParams(
                            Double.parseDouble(parts[0]),
                            Double.parseDouble(parts[1]),
                            sideLength
                    );
                } catch (NumberFormatException e) {
                    return null;
                }
            } catch (SQLException e) {
                return null;
            }
        }
    }

    // ── 物品数据库 ──

    public static class BagItemDb {
        private static final Logger log = LoggerFactory.getLogger(BagItemDb.class);
        private final Connection conn;
        private PreparedStatement stmt;

        public BagItemDb(Connection conn) { this.conn = conn; }

        public boolean load() {
            try {
                stmt = conn.prepareStatement("SELECT name FROM bag_item WHERE id = ?");
                log.info("物品数据库已加载");
                return true;
            } catch (SQLException e) {
                log.warn("物品数据库加载失败: {}", e.getMessage());
                return false;
            }
        }

        public synchronized String lookup(int goodsId) {
            if (stmt == null) return null;
            try {
                stmt.setInt(1, goodsId);
                ResultSet rs = stmt.executeQuery();
                return rs.next() ? rs.getString("name") : null;
            } catch (SQLException e) {
                return null;
            }
        }
    }

    // ── 区域数据库 ──

    public static class AreaFuncDb {
        private static final Logger log = LoggerFactory.getLogger(AreaFuncDb.class);
        private final Connection conn;
        private PreparedStatement stmt;

        public AreaFuncDb(Connection conn) { this.conn = conn; }

        public boolean load() {
            try {
                stmt = conn.prepareStatement("SELECT editor_name FROM area_func WHERE id = ?");
                log.info("区域数据库已加载");
                return true;
            } catch (SQLException e) {
                log.warn("区域数据库加载失败: {}", e.getMessage());
                return false;
            }
        }

        public synchronized String lookup(int areaFuncConfId) {
            if (stmt == null) return null;
            try {
                stmt.setInt(1, areaFuncConfId);
                ResultSet rs = stmt.executeQuery();
                return rs.next() ? rs.getString("editor_name") : null;
            } catch (SQLException e) {
                return null;
            }
        }
    }

    // ── 通用 ID→名字 数据库 ──

    public static class NameDb {
        private static final Logger log = LoggerFactory.getLogger(NameDb.class);
        private final Connection conn;
        private final String tableName;
        private final String nameColumn;
        private final int fallbackDivisor;
        private final ThreadLocal<PreparedStatement> stmt = new ThreadLocal<>();
        private volatile boolean loaded;

        public NameDb(Connection conn, String tableName, String nameColumn) {
            this(conn, tableName, nameColumn, 1);
        }

        /**
         * @param conn           SQLite 连接
         * @param tableName      表名（如 "skill"、"buff"、"pet"）
         * @param nameColumn     名字列名（如 "name"、"editor_name"）
         * @param fallbackDivisor ID 未命中时尝试 id/fallbackDivisor（如 100 用于 skill 8位→6位）
         */
        public NameDb(Connection conn, String tableName, String nameColumn, int fallbackDivisor) {
            this.conn = conn;
            this.tableName = tableName;
            this.nameColumn = nameColumn;
            this.fallbackDivisor = fallbackDivisor;
        }

        public boolean load() {
            try {
                // 验证 SQL 合法性（不保存，各线程自行创建）
                conn.prepareStatement(
                        "SELECT " + nameColumn + " FROM " + tableName + " WHERE id = ?").close();
                loaded = true;
                log.info("数据库已加载: {}", tableName);
                return true;
            } catch (SQLException e) {
                log.warn("数据库加载失败 {}: {}", tableName, e.getMessage());
                return false;
            }
        }

        private PreparedStatement getStmt() throws SQLException {
            PreparedStatement s = stmt.get();
            if (s == null) {
                s = conn.prepareStatement(
                        "SELECT " + nameColumn + " FROM " + tableName + " WHERE id = ?");
                stmt.set(s);
            }
            return s;
        }

        public String lookup(int id) {
            if (!loaded) return null;
            try {
                PreparedStatement s = getStmt();
                s.setInt(1, id);
                ResultSet rs = s.executeQuery();
                String result = rs.next() ? rs.getString(nameColumn) : null;
                if (result != null || fallbackDivisor <= 1) return result;
                // fallback: 尝试 id / fallbackDivisor（如 skill 20010300 → 200103）
                int altId = id / fallbackDivisor;
                if (altId == id) return null;
                s.setInt(1, altId);
                rs = s.executeQuery();
                return rs.next() ? rs.getString(nameColumn) : null;
            } catch (SQLException e) {
                return null;
            }
        }

        public boolean isLoaded() { return loaded; }
    }
}
