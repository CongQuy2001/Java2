/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai1And2;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
public class Student  implements Serializable{
    public String name;
    public double  Diem;
    public String nganh;

    public Student(String name, double Diem, String nganh) {
        this.name = name;
        this.Diem = Diem;
        this.nganh = nganh;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }


    public String getGrade() {
        if (this.Diem<3) {
            return "kém";
        }
        if (this.Diem<5) {
            return "yếu";
        }
        if (this.Diem<6.5) {
            return "trung bình";
        }
        if (this.Diem<7.5) {
            return "khá";
        }
        if (this.Diem<9) {
            return "giỏi";
        }
        return "xuất sắc";
    }
    public boolean isbonus() {
        return this.Diem>=7.5;
    }
}
