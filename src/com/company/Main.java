package com.company;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static Date main(String[] args) throws ParseException {
	// write your code here

        Main obj = new Main();

        Ticket tick = new Ticket();
        Time time = new Time();




        int id = tick.getTicketID();
        long prked = 0;
        Date prkStart = tick.getStrDate();
        Date parkfin = tick.getFinDate();
        double total = 0.00;
        double cktotal;

        double finaltotal = 0;
        int numtickets = 0;
        int numlost= 0;
        double losttotal = numlost *25.00;

        int choice;
        Ticket ticket = new Ticket();
        Scanner key = new Scanner(System.in);
        do {
            System.out.println("Enter a choice:\n1)Check In/Close Garage\n2)Check Out\n\n3) Exit");
            choice = key.nextInt();

            if (choice == 1) {
                System.out.println("Best Value Parkig Garage");
                System.out.println("========================");
                System.out.println("1 - Check/In");
                System.out.println("2 - Close Garage");
                System.out.print("=> ");
                int in = key.nextInt();

                if (in == 1){
                    numtickets ++;
                    break;
                }
                else if (in == 2){

                        System.out.println("Best Value Parking Garage");
                        System.out.println("=========================");
                        System.out.println("Activity to Date");
                        System.out.println("$" + cktotal + " was collected from " + numtickets + " Check Ins");
                        System.out.println("$" + losttotal + " was collected from " + numlost + " Lost Tickets");
                        System.out.println("$" + finaltotal + " was collected overall");

                }
            }

            else if (choice == 2) {
                System.out.println("Best Value Parkig Garage");
                System.out.println("========================");
                System.out.println("1 - Check/Out");
                System.out.println("2 - Lost Ticket");
                System.out.print("=> ");
                int out = key.nextInt();

                if (out == 1){

                    prkStart = ticket.getStrDate();
                    parkfin = ticket.getFinDate();
                    prked = ticket.difference();
                    System.out.println("Best Value Parkig Garage");
                    System.out.println("========================");
                    System.out.println("Receipt for a vehicle id " + id);
                    System.out.println(prked + " hours parked  " + prkStart + "am - " + parkfin + "pm");
                    System.out.println("$" + total);

                }

                else if (out == 2){
                    System.out.println("Best Value Parking Garage");
                    System.out.println("=========================");
                    System.out.println("Receipt for a vehicle id " + id);
                    System.out.println("Lost Ticket");
                    System.out.println("$25.00");
                    numlost++;



                }



            }

        }while (choice == 3 );


        return prkStart;
    }
}
