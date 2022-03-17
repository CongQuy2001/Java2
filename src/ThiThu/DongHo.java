/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiThu;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
public class DongHo implements Serializable {
    String TenSp;
    double Gia;
    String Hang;

    public DongHo() {
    }

    public DongHo(String TenSp, double Gia, String Hang) {
        this.TenSp = TenSp;
        this.Gia = Gia;
        this.Hang = Hang;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

 
    
}
