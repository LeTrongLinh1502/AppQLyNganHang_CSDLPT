/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ThongTinGiaoDich;

/**
 *
 * @author HP
 */
public class ThongtinGiaodichDAO extends DAO {

    public ThongtinGiaodichDAO() {
        super();
    }

   

    public ArrayList<ThongTinGiaoDich> getALLThongTinGiaodich() throws SQLException {
        String sql = "USE QuanLyTaiKhoanNganHang2 Select * from ThongTinGiaoDich ";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        ArrayList<ThongTinGiaoDich> tt = new ArrayList<ThongTinGiaoDich>();
        while (rs.next()) {
            ThongTinGiaoDich tt1 = new ThongTinGiaoDich();
            tt1.setID(rs.getInt("Id_Thong_Tin_Giao_Dich"));
            tt1.setSoTien(rs.getFloat("SoTien"));
            tt1.setThoiGian(rs.getDate("ThoiGian"));
            tt1.setIDTaiKhoanGui(rs.getInt("IdTaiKhoan"));
                System.out.println(rs.getDate("ThoiGian"));
            tt.add(tt1);

        }

        return tt;

    }
}
