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
public class EvenThread extends  Thread{
        @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println(""  +i);
        }
        try {
            Thread.sleep(15);
        } catch (InterruptedException ex) {
            
        }
        System.out.println();
    }
}
