/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 *
 * @author L115student
 */
public class DateUtilities {

    public String toString(LocalDateTime date) {
        DateTimeFormatter formatIt = DateTimeFormatter.BASIC_ISO_DATE;
        String stringDate = date.format(formatIt);
        return stringDate;
    }

    public String toString(LocalDateTime date, String pattern) {
//        date = LocalDateTime.now();
        DateTimeFormatter formatIt = DateTimeFormatter.ofPattern(pattern);
        String stringDate = date.format(formatIt);
        return stringDate;
    }

    public LocalDate toDate(String dateString) {
//        LocalDateTime date = null;
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateString);
//        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ldt = LocalDate.parse(dateString, dateformatter);
        return ldt;
    }

    public LocalDate toDate(String dateString, String pattern) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate ldt = LocalDate.parse(dateString, dateFormatter);
        return ldt;
    }

    public String getDuration(LocalDateTime d1, LocalDateTime d2) {
        Duration duration = Duration.between(d1, d2);
        long seconds = Math.abs(duration.getSeconds());
        long hours = seconds / 3600;
        seconds -= (hours * 3600);
        long minutes = seconds / 60;
        seconds -= (minutes * 60);
        return hours + " Hours " + minutes + " minutes " + seconds + " seconds ";

    }

}
