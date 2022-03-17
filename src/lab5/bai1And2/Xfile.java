/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai1And2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;


/**
 *
 * @author JosCongQuy
 */
public class Xfile {

    public static Object readObject(String path) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(String path, Object object) throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public static byte[] read(String path) throws FileNotFoundException, IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int n = fileInputStream.available();
            byte[] data = new byte[n];
            fileInputStream.read(data);
            fileInputStream.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            fileOutputStream.write(data);
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        byte[] data = Xfile.read("D:\\lab5.txt");
        Xfile.write("D:\\lab5.txt", data);
        System.out.println("1");
    }

}
