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
import java.util.List;
import model.ChiNhanh;

/**
 *
 * @author HP
 */
public class ChiNhanhDAO extends DAO {

    public ChiNhanhDAO() {
        super();
    }

    public List<ChiNhanh> getAllChiNhanh() {
        List<ChiNhanh> chiNhanhs = new ArrayList<>();
        try {

            String sql = "USE QuanLyTaiKhoanNganHang2 SELECT * FROM ChiNhanh;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiNhanh chiNhanh = new ChiNhanh();
                chiNhanh.setID(rs.getInt("Id_Chi_Nhanh"));
                chiNhanh.setTenChiNhanh(rs.getString("TenChiNhanh"));
                chiNhanh.setDiaChi(rs.getString("DiaChi"));
                chiNhanh.setSdt(rs.getString("SDT"));
                
                chiNhanhs.add(chiNhanh);
            }

        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra!");
        }
        return chiNhanhs;
    }
    
    
}
