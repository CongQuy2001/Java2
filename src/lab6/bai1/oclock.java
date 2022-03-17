/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.bai1;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;

/**
 *
 * @author JosCongQuy
 */
public class oclock  extends Thread{
    private  JButton buttun;

    public oclock(JButton buttun) {
        this.buttun = buttun;
    }

    
    @Override
    public void run() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss aa");
            while (true) {   
                Date day = new Date();
            String mode = simpleDateFormat.format(day);
            buttun.setText(mode);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
        }
    }
}
