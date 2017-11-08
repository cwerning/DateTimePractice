/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;



/**
 *
 * @author L115student
 */
public class DateUtilities {
    
    public String toString(LocalDateTime date){
        DateTimeFormatter formatIt = DateTimeFormatter.BASIC_ISO_DATE;
        String stringDate = date.format(formatIt);
        return stringDate;
    }
    
    public String toString(LocalDateTime date, String pattern){
//        date = LocalDateTime.now();
        DateTimeFormatter formatIt = DateTimeFormatter.ofPattern(pattern);
        String stringDate = date.format(formatIt);
        return stringDate;
    }
    
    public static void main(String[] args) {
        
        DateUtilities dateUtil = new DateUtilities();
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime date2 = date.with(TemporalAdjusters.lastDayOfMonth());
        
        System.out.println(dateUtil.toString(date, "MMM d yyyy"));
        System.out.println(dateUtil.toString(date2));
    }
}
