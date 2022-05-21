/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class KhachHang {
    private int ID;
    private String ten;
    private String CMT;
    private String sdt;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private int matKhau;
    private TaiKhoan taiKhoan;

    public KhachHang() {
        taiKhoan = new TaiKhoan();
    }

    public KhachHang(int ID, String ten, String CMT, String sdt, String gioiTinh, Date ngaySinh, String diaChi, int matKhau, TaiKhoan taiKhoan) {
        this.ID = ID;
        this.ten = ten;
        this.CMT = CMT;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.taiKhoan = taiKhoan;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(int matKhau) {
        this.matKhau = matKhau;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    
    
    
}
