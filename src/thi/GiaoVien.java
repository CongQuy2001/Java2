/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
public class GiaoVien implements Serializable{
    private String Ten;
    private String Mon;
    private double  luong;

    public GiaoVien() {
    }

    public GiaoVien(String Ten, String Mon, double luong) {
        this.Ten = Ten;
        this.Mon = Mon;
        this.luong = luong;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public boolean  getStatus(double luong) {
        if(luong>1000){
        return true;
        }
        return false;
    }
}
