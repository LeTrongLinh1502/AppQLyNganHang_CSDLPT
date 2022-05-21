/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author HP
 */
public class ChiNhanh {
    private  int ID;
    private String tenChiNhanh;
    private String diaChi;
    private String sdt;
    private NhanVien nhanVien;
    private TaiKhoan taiKhoan;

    public ChiNhanh() {
    }

    public ChiNhanh(int ID, String tenChiNhanh, String diaChi, String sdt, NhanVien nhanVien, TaiKhoan taiKhoan) {
        this.ID = ID;
        this.tenChiNhanh = tenChiNhanh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.nhanVien = nhanVien;
        this.taiKhoan = taiKhoan;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenChiNhanh() {
        return tenChiNhanh;
    }

    public void setTenChiNhanh(String tenChiNhanh) {
        this.tenChiNhanh = tenChiNhanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

 

}