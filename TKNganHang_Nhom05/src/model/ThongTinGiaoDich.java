/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author HP
 */
public class ThongTinGiaoDich {
    private int ID;
    private float soTien;
    private Date thoiGian;
    private int IDTaiKhoanNhan;
        private int IDTaiKhoanGui;

    
    public ThongTinGiaoDich(){
        
    }

    public ThongTinGiaoDich(int ID, float soTien, Date thoiGian, int IDTaikhoanGui) {
        this.ID = ID;
        this.soTien = soTien;
        this.thoiGian = thoiGian;
        this.IDTaiKhoanGui =  IDTaikhoanGui;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getIDTaiKhoanNhan() {
        return IDTaiKhoanNhan;
    }

    public void setIDTaiKhoanNhan(int IDTaiKhoanNhan) {
        this.IDTaiKhoanNhan = IDTaiKhoanNhan;
    }

    public int getIDTaiKhoanGui() {
        return IDTaiKhoanGui;
    }

    public void setIDTaiKhoanGui(int IDTaiKhoanGui) {
        this.IDTaiKhoanGui = IDTaiKhoanGui;
    }
    
    
}
