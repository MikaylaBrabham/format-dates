package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        //Get the local date and time right now
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Today is: " + dateTimeNow);

        DateTimeFormatter formatDateTime =
            DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");

        String formattedDateTime = dateTimeNow.format(formatDateTime);

        System.out.println("Today is: " + formattedDateTime);

    }
}
