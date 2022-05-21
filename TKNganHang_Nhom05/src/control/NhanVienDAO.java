/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author HP
 */
public class NhanVienDAO extends DAO {

    public NhanVienDAO() {
        super();
    }

    public List<NhanVien> getAllNhanvien() {
        List<NhanVien> nhanViens = new ArrayList<>();
        try {

            String sql = "USE QuanLyTaiKhoanNganHang2 "
                    + "SELECT NhanVien.IdNhanVien, NhanVien.TenNhanVien, NhanVien.SDT, NhanVien.CMT, NhanVien.NgaySinh,NhanVien.DiaChi, NhanVien.ChucVu, NhanVien.IDChiNhanh, ChiNhanh.TenChiNhanh FROM NhanVien "
                    + "INNER JOIN ChiNhanh ON NhanVien.IDChiNhanh = ChiNhanh.Id_Chi_Nhanh;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setID(rs.getInt("IdNhanVien"));
                nhanVien.setTen(rs.getString("TenNhanVien"));
                nhanVien.setSdt(rs.getString("SDT"));
                nhanVien.setCMT(rs.getString("CMT"));
                nhanVien.setNgaySinh(rs.getDate("NgaySinh"));
                nhanVien.setDiaChi(rs.getString("DiaChi"));
                nhanVien.setChucVu(rs.getString("ChucVu"));
                nhanVien.setMaChiNhanh(rs.getInt("IDChiNhanh"));
                nhanVien.setChiNhanh(rs.getString("TenChiNhanh"));

                nhanViens.add(nhanVien);
            }

        } catch (SQLException ex) {
            System.err.println("Có lỗi xảy ra!");
        }
        return nhanViens;
    }

    public boolean themNhanVien(NhanVien nhanVien) {
        try {
            String sql = "USE QuanLyTaiKhoanNganHang2 "
                    + "INSERT INTO NhanVien (TenNhanVien,SDT,CMT,NgaySinh,DiaChi,ChucVu,IDChiNhanh) VALUES (?,?, ?, ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getTen());
            ps.setString(2, nhanVien.getSdt());
            ps.setString(3, nhanVien.getCMT());
            ps.setDate(4, new java.sql.Date(nhanVien.getNgaySinh().getTime()));
            ps.setString(5, nhanVien.getDiaChi());
            ps.setString(6, nhanVien.getChucVu());
            ps.setInt(7, nhanVien.getMaChiNhanh());
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Có lỗi xảy ra!");
            return false;
        }
    }

    public boolean xoaNhanVien(int index) {
        try {
            String maNV = Integer.toString(index);
            String sql = "USE QuanLyTaiKhoanNganHang2 DELETE FROM NhanVien WHERE NhanVien.IdNhanVien =" + maNV;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Có lỗi xảy ra!");
            return false;
        }
    }

    public boolean suaNhanVien(int index, NhanVien nhanVien) {
        try {
            String maNV = Integer.toString(index);
            String sql = "USE QuanLyTaiKhoanNganHang2 "
                    + "UPDATE NhanVien set TenNhanVien = ?,SDT = ?,CMT = ? ,NgaySinh = ?,DiaChi = ?,ChucVu = ?,IDChiNhanh = ? WHERE NhanVien.IdNhanVien = " + maNV;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getTen());
            ps.setString(2, nhanVien.getSdt());
            ps.setString(3, nhanVien.getCMT());
            ps.setDate(4, new java.sql.Date(nhanVien.getNgaySinh().getTime()));
            ps.setString(5, nhanVien.getDiaChi());
            ps.setString(6, nhanVien.getChucVu());
            ps.setInt(7, nhanVien.getMaChiNhanh());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Có lỗi xảy ra!");
            return false;
        }
    }

}
