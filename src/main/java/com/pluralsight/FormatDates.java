package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        //Get the local date and time right now
        LocalDateTime dateTime1 = LocalDateTime.now();
        //display the unformatted date and time now
        System.out.println("Today is: " + dateTime1);

        //Create a formatter for the date and time for mm/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dateTime1.format(formatter1);
        //display the formatted date and time
        System.out.println("Today is: " + formattedDate1);

        //create a formatter for the date and time for yyyy-mm-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = dateTime1.format(formatter2);
        //display the formatted date and time
        System.out.println("Today is: " + formattedDate2);

        //create a formatter for the date and time for full weekday dd, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        String formattedDate3 = dateTime1.format(formatter3);
        //display the formatted date and time
        System.out.println("Today is: " + formattedDate3);

        // create a formatter for the date and time for full weekday, month dd, 2026 hh:mm
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");
        String formattedDate4 = dateTime1.format(formatter4);
        // display the formatted date and time
        System.out.println("Today is: " + formattedDate4);

    }
}
