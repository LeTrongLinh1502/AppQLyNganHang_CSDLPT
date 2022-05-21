/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author HP
 */
public class TaiKhoan {
    private int ID;
    private float soDu;
    private Timestamp ngayTao;
    private String STK;
    private ThongTinGiaoDich thongTinGiaoDich;
    private NhanVien nhanVien;
    private The the;
    private SoTietKiem soTietKiem;

    public TaiKhoan() {
        thongTinGiaoDich = new ThongTinGiaoDich();
        the = new The();
    }

    public TaiKhoan(int ID, float soDu, Timestamp ngayTao, String STK, KhachHang khachHang, ThongTinGiaoDich thongTinGiaoDich, NhanVien nhanVien, The the, SoTietKiem soTietKiem) {
        this.ID = ID;
        this.soDu = soDu;
        this.ngayTao = ngayTao;
        this.STK = STK;
        this.thongTinGiaoDich = thongTinGiaoDich;
        this.nhanVien = nhanVien;
        this.the = the;
        this.soTietKiem = soTietKiem;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public ThongTinGiaoDich getThongTinGiaoDich() {
        return thongTinGiaoDich;
    }

    public void setThongTinGiaoDich(ThongTinGiaoDich thongTinGiaoDich) {
        this.thongTinGiaoDich = thongTinGiaoDich;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public The getThe() {
        return the;
    }

    public void setThe(The the) {
        this.the = the;
    }

    public SoTietKiem getSoTietKiem() {
        return soTietKiem;
    }

    public void setSoTietKiem(SoTietKiem soTietKiem) {
        this.soTietKiem = soTietKiem;
    }
    
    
    
   
    
         
   
}
