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
public class The {
    private int ID;
    private Date ngayTao;
    private int matKhau;
    private String status;
    private String soThe;
    
    public The(){
        
    }

    public The(int ID, Date ngayTao, int matKhau, String status, String soThe) {
        this.ID = ID;
        this.ngayTao = ngayTao;
        this.matKhau = matKhau;
        this.status = status;
        this.soThe = soThe;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(int matKhau) {
        this.matKhau = matKhau;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }
    
    
}
