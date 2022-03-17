/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JosCongQuy
 */
public class OddThread  extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println(""  +i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            
        }
        System.out.println();
    }
}
