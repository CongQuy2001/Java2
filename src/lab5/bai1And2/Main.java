/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai1And2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JosCongQuy
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Student ST = new Student("nam", 2, "CNTT");
        String path = "D:/Lab5Bai2.txt";
        Xfile.writeObject(path, ST);
        Student SV = (Student) Xfile.readObject(path);
        System.out.println("tên sinh viên là   :  " + SV.getName());
        System.out.println("Hạnh Kiểm là     :  " + SV.getGrade());
        System.out.println("chuyên ngành học là   :" + SV.getNganh());

    }
}
