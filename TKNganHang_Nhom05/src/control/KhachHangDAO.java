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
import java.sql.Statement;
import static javax.management.remote.JMXConnectorFactory.connect;
import model.*;
/**
 *
 * @author HP
 */
public class KhachHangDAO extends DAO {

    public KhachHangDAO() {
        super();
    }
    
    
    
    public boolean checkNguoigui(String stk1, String mk, String mk2) throws SQLException{
        String sql = "USE QuanLyTaiKhoanNganHang2 SELECT Khachhang.*  FROM KhachHang,TaiKhoan Where dbo.TaiKhoan.idKhachHang=dbo.KhachHang.ID_Khach_Hang AND dbo.TaiKhoan.STK =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,stk1);
            ResultSet rs = ps.executeQuery();
        
       
        String mkDung="";
        while(rs.next()){
                System.out.println(rs.getString("MatKhau"));
                mkDung = rs.getString("MatKhau");
            }
//        System.out.println(mkDung);
        if(mk.equals(mkDung)&&mk2.equals(mkDung)) return true;
        return false;
    }
    public int Chuyenkhoan(String stk1,String stk2, String sotienString) throws SQLException{
       String sql = "USE QuanLyTaiKhoanNganHang2 SELECT Taikhoan.*  FROM TaiKhoan Where STK = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,stk1);
        ResultSet rs = ps.executeQuery();
        float soDU = 0;
        while(rs.next()){
                
                soDU = rs.getFloat("SoDu");
                System.out.println(rs.getFloat("SoDu"));
        }    
        if(soDU>=Float.parseFloat(sotienString)){
            PreparedStatement ps1 = con.prepareStatement("USE QuanLyTaiKhoanNganHang2 EXEC [dbo].[chuyenKhoan] ?,?,?,0");
            ps1.setInt(1,Integer.parseInt(stk1));
            ps1.setInt(2,Integer.parseInt(stk2));
            ps1.setFloat(3,Float.parseFloat(sotienString));
            ps1.executeUpdate();
            return 1;
        }
       return 0;
    }
    public float Congtien(String stk,String sotien) throws SQLException {
        
        String sql = "USE QuanLyTaiKhoanNganHang2 Select sodu from taikhoan where STK=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,stk);
        ResultSet rs = ps.executeQuery();
        float soDu=0;
        while(rs.next()){
                
                soDu = rs.getFloat("SoDu");
                
        } 
        
        soDu+=Float.parseFloat(sotien);
        
        PreparedStatement ps1 = con.prepareStatement("USE QuanLyTaiKhoanNganHang2 UPDATE TaiKhoan SET SoDu = ? WHERE STK=?");
        ps1.setFloat(1,soDu);
        ps1.setString(2,stk);
        ps1.executeUpdate();
        System.out.println(soDu);
        return soDu;
    }
    public static void main(String[] args) {
        KhachHangDAO kh = new KhachHangDAO();
        try {
       //     boolean check = kh.checkNguoigui("1234", "123", "123");
        //  kh.Chuyenkhoan("1234", "12345", "100");
        float check = kh.Congtien("1234", "100");
        } catch (Exception e) {
        }
       // boolean check = kh.checkNguoigui("22222", "1234556", "1234556");
    }
    
    
}
