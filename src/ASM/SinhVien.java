/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
public class SinhVien implements Serializable {

    String Ma;
    private String Hoten;
    private int Tuoi;
    private String Email;
    private double Luong;
    String index;

    public SinhVien() {
    }

    public SinhVien(String Ma, String Hoten, int Tuoi, String Email, double Luong) {
        this.Ma = Ma;
        this.Hoten = Hoten;
        this.Tuoi = Tuoi;
        this.Email = Email;
        this.Luong = Luong;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

}
