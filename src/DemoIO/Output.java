/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author JosCongQuy
 */
public class Output {

    public static void main(String[] args) throws IOException {
        readfile("D:\\tttt.txt");
    }

    public static void readfile(String filepath) throws IOException {
        // tạo ra một đối tượng 
//        FileInputStream inputStream = new FileInputStream(filepath);
//        // tạo biến   character
//        int character;
//        // chuyển while => use inputStream (1) read() != -1,>-1,0
//        while ((character = inputStream.read()) > -1) {
//            char c = (char) character;
//            System.out.print(c);
//
//        }
//        // close input
//        inputStream.close();
//        System.out.println("Done!");
//        
        Path path = Paths.get(filepath);
        try {
            // Java 8
            List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
            list.forEach(System.out::println);

            // Java 8
            Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
  
  
}
