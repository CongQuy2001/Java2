/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JosCongQuy
 */
public class Main {
    
    public static void main(String[] args) {
        Sanpham sp1 = new Sanpham();
        sp1.nhap();
        sp1.xuat();
        
        List<Product> lstProduct = new ArrayList<>();
        sp1.nhap(lstProduct, 1, 2);
        System.out.println(lstProduct);
        
    }
    

}
