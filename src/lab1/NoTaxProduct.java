/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;



/**
 *
 * @author JosCongQuy
 */
public class NoTaxProduct extends Product {

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getImportTax() {
        return 0;
    }

    @Override
    public String toString() {
        return "NoTaxProduct{" + "name=" + name + ", price=" + price + ",thue=" + getImportTax() + '}';
    }

}
