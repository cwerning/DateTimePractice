/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.api;

/**
 *
 * @author cwerning
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestDate {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
        String dateValue = "10/31/17";
        Date date = sdf.parse(dateValue);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(date);
        
    }
    
}
