package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        //Get the local date and time right now
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Today's current time and date without any formatting is: " + dateTimeNow);



        //get the local date and time in mm/dd/yyyy format
        DateTimeFormatter formatDateTime1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDateTime1 = dateTimeNow.format(formatDateTime1);
        System.out.println("Today is: " + formattedDateTime1);

        //get the local date and time in yyyy-mm-yy format
        DateTimeFormatter formatDateTime2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDateTime2 = dateTimeNow.format(formatDateTime2);
        System.out.println("Today is: " + formattedDateTime2);

        //get the local date and time in dayofmonth dd, yyyy

        //get the local date and time in dayofmonth, partialmonth dd, yyyy time in civilian hours xx:xx

        //format the current day, date, and time rightnow
        DateTimeFormatter formatDateTime =
            DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");

        //display the current day and time with my formatting
        String formattedDateTime5 = dateTimeNow.format(formatDateTime);
        System.out.println("Today is: " + formattedDateTime5);

    }
}
