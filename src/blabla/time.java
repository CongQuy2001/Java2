/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blabla;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import javax.swing.JLabel;

/**
 *
 * @author JosCongQuy
 */
public class time extends Thread{
    JLabel jlabletime;

    public time(JLabel jlabletime) {
        this.jlabletime = jlabletime;
    }
   
    @Override
    public  void run () {
        SimpleDateFormat SPL = new SimpleDateFormat("hh mm ss aa");
        while (true) {            
            Date day = new Date();
        String mode = SPL.format(day);
        jlabletime.setText(mode);
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        }
       
    }


}
