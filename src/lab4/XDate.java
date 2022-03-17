/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    public static Date Parse(String text,String pattern) throws RuntimeException {
        SimpleDateFormat Formater = new SimpleDateFormat();
        try {
            Formater.applyPattern(pattern);
            return Formater.parse(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Date parse(String text) throws RuntimeException {
        return XDate.Parse(text, "dd-MM-yyyy");
    }

}
