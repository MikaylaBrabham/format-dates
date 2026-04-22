package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        //Get the local date and time right now
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("Today is: " + dateTime1);

        //Create a formatter for the date and time for mm/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dateTime1.format(formatter1);

        //create a formatter for the date and time for yyyy-mm-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = dateTime1.format(formatter2);

    }
}
