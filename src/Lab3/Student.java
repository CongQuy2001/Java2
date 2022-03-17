/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author JosCongQuy
 */
class Student {

    String name;
    double Diem;
    String Nganh;


    public Student(String name, double Diem, String Nganh) {
        this.name = name;
        this.Diem = Diem;
        this.Nganh = Nganh;
    }

    Student() {

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
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

  public    String getGrade() {

        if (this.Diem < 3) {
            return "Kém";
        }
        if (this.Diem < 5) {
            return "Yếu";
        }
        if (this.Diem < 6.5) {
            return "Trung bình";
        }
        if (this.Diem < 7.5) {
            return "Khá";
        }
        if (this.Diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.Diem >= 7.5;
    }
}
  
