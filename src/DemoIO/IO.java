/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoIO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author JosCongQuy
 */
public class IO {
    private  static final  String Demo_Java = "gffgfg.rtt";
    public static void main(String[] args) throws IOException {
        // tạo ra một đối tượng 
        FileOutputStream outputStream = new FileOutputStream( Demo_Java);
        // tạo ra dữ liệu String
        String data = "hello java 2";
        // chuyển String sang dạng byte
        byte[] dataBytes = data.getBytes();
        // dùng đối tượng để write flie
        outputStream.write(dataBytes);
        // close(1)
        outputStream.close();
        System.out.println("Done");
    }
}
