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
public class SoTietKiem {
    private  int ID;
    private  float soTien;
    private String maSo;
    private  float laiSuat;
    private Date thoiHan;

    public SoTietKiem() {
    }
    
    public SoTietKiem(int ID, float soTien, String maSo, float laiSuat, Date thoiHan) {
        this.ID = ID;
        this.soTien = soTien;
        this.maSo = maSo;
        this.laiSuat = laiSuat;
        this.thoiHan = thoiHan;
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

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    public Date getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(Date thoiHan) {
        this.thoiHan = thoiHan;
    }
    
    
}
