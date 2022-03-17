/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class Sanpham {

    private Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> listsp = new ArrayList<>();
    private String name;
    private double price;

    public void nhap() {
        while (true) {
            System.out.println("mời bạn nhập tên");
            name = sc.nextLine();
            System.out.println("mời bạn nhập đơn giá");
            price = Double.parseDouble(sc.nextLine());
            Product sp = new Product(name, price);
            listsp.add(sp);
            System.out.println("bạn muốn nhập nữa k y/n");
            String T = sc.nextLine();
            if (T.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void nhap(List<Product> lstProduct, int numberNoTax, int numberTax) {
        for (int i = 0; i < numberNoTax; i++) {
            System.out.println("mời bạn nhập tên");
            name = sc.nextLine();
            System.out.println("mời bạn nhập đơn giá");
            price = Double.parseDouble(sc.nextLine());
            Product sp = new Product(name, price);
            listsp.add(sp);
            Product noT = new NoTaxProduct(name,price);
            lstProduct.add(noT);
        }

        for (int i = 0; i < numberTax; i++) {
            System.out.println("mời bạn nhập tên");
            name = sc.nextLine();
            System.out.println("mời bạn nhập đơn giá");
            price = Double.parseDouble(sc.nextLine());
            Product sp = new Product(name, price);
            listsp.add(sp);
            Product tax = new Product(name,price);
            lstProduct.add(tax);
        }

    }

    public void xuat() {
        for (Product sp : listsp) {
            System.out.println(sp);
        }
    }

}
