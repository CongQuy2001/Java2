/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.bai3;



/**
 *
 * @author JosCongQuy
 */
public class Main {

    public static void main(String[] args) {
        OddThread thread1 = new OddThread();
        EvenThread thread2 = new EvenThread();

        thread1.start();
        
        try {
            thread1.join();
        } catch (InterruptedException ex) {
        }
        thread2.start();
        System.out.println("complete!");
    }

}
