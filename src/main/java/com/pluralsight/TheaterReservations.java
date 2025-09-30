package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = input.nextInt();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate formattedDate = LocalDate.parse(date, dateFormatter);

        int atSpace = name.indexOf(' ');
        String firstName = name.substring(0, atSpace);
        String lastName = name.substring(atSpace + 1);

        /*String ticketName = "";
        if(tickets <= 1){
            ticketName = "ticket";
        } else {
            ticketName = "tickets";
        }*/

        String ticketName = (tickets <= 1) ? "ticket" : "tickets";

        System.out.println(tickets + " " + ticketName + " reserved for " + formattedDate + " under " + lastName + ", " + firstName);


    }
}
