/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
/**
 *
 * @author HP
 */
public class NhanVien {
    private int ID;
    private String ten;
    private String sdt;
    private String CMT;
    private Date ngaySinh;
    private String diaChi;
    private String chucVu;
    private String chiNhanh;
    private int maChiNhanh;
    public NhanVien() {
    }

    public NhanVien(int ID, String ten, String sdt, String CMT, Date ngaySinh, String diaChi, String chucVu, String chiNhanh,int maChiNhanh) {
        this.ID = ID;
        this.ten = ten;
        this.sdt = sdt;
        this.CMT = CMT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.chiNhanh = chiNhanh;
        this.maChiNhanh = maChiNhanh;
    }
    
     public NhanVien(String ten, String sdt, String CMT, Date ngaySinh, String diaChi, String chucVu,int maChiNhanh) {
        this.ten = ten;
        this.sdt = sdt;
        this.CMT = CMT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.maChiNhanh = maChiNhanh;
    }

  

    public String getChiNhanh() {
        return chiNhanh;
    }

    public void setChiNhanh(String chiNhanh) {
        this.chiNhanh = chiNhanh;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
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

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getMaChiNhanh() {
        return maChiNhanh;
    }

    public void setMaChiNhanh(int maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }
    
    
            
}
