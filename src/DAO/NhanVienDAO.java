/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhanVien;
import Utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author vietm
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien(MaNV, MatKhau, HoTen, VaiTro, GioiTinh) VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?, HoTen = ?, VaiTro = ?, GioiTinh = ? WHERE MaNV = ?";
    String UPDATE_SQL_MK = "update NhanVien set MatKhau = ? where MaNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        XJdbc.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.isVaiTro(), entity.getGioiTinh());
    }

    @Override
    public void update(NhanVien entity) {
        XJdbc.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.isVaiTro(),entity.getGioiTinh(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            //tạo vòng lặp add dữ liệu từ ResultSet vào list
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void updatee(NhanVien entity){
        XJdbc.update(UPDATE_SQL_MK, entity.getMatKhau(), entity.getMaNV());
    }
}
