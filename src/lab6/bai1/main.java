/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.bai1;

/**
 *
 * @author JosCongQuy
 */
public class main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread threth1 = new Thread(myThread1);
        Thread threth2 = new Thread(myThread2);

        threth1.setPriority(threth1.MAX_PRIORITY);
        threth2.setPriority(threth2.MIN_PRIORITY);

        threth1.start();
        threth2.start();
        System.out.println("complete!");
    }
}
