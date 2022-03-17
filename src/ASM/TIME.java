/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

/**
 *
 * @author JosCongQuy
 */
public class TIME  extends  Thread {
    private JLabel jLabeltime;

    public TIME(JLabel jLabeltime) {
        this.jLabeltime = jLabeltime;
    }


    @Override
    public void run() {
        SimpleDateFormat SPL = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date day = new  Date();
            String mode = SPL.format(day);
        jLabeltime.setText(mode);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }
        }
    }
}
