/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ôntap;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
public class DienThoai implements Serializable {

    private String ten;
    private double gia;
    private String hang;

    public DienThoai() {
    }

    public DienThoai(String ten, double gia, String hang) {
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

}
