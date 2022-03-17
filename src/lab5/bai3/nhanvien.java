/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai3;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
public class nhanvien implements Serializable { //thầy bảo thiếu implements Seri này là đọc ghi không được
    private String name;
    private double luong;

    public nhanvien() {
    }

    public nhanvien(String name, double luong) {
        this.name = name;
        this.luong = luong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
