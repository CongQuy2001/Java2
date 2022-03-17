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
public class Product implements Dao{
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public double getImportTax() {
        return getPrice()*0.1;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ",thue=" + getImportTax() + '}';
    }

    @Override
    public void insert() {
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void update() {
       System.out.println("sửa thành công!"); 
    }

    @Override
    public void delete() {
     System.out.println("xoá thành công!");
    }

    @Override
    public void select() {
       System.out.println(" select thành công!");
    }
    
}
