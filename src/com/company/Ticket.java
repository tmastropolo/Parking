package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;

public class Ticket {


    int idcount = 0;
    int ticketID;
    Date strDate;
    Date finDate;
    double tickTotal;
    double chkIntotal;
    int LostTick;
    double overall;


    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    double bill;
    Time time = new Time();

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        ticketID++;
        this.ticketID = ticketID;
    }

    public Date getStrDate() {
        return strDate;
    }

    public void setStrDate(Date strDate) throws ParseException {
        this.strDate = time.StartTime(strDate);
    }

    public Date getFinDate() {
        return finDate;
    }

    public void setFinDate(Date finDate) throws ParseException {
        this.finDate = time.FinishTime(finDate);
    }

    public double getTickTotal() {
        return tickTotal;
    }

    public void setTickTotal(double tickTotal) {
        this.tickTotal = tickTotal;
    }

    public double getChkIntotal() {
        return chkIntotal;
    }

    public void setChkIntotal(double chkIntotal) {
        this.chkIntotal = chkIntotal;
    }

    public int getLostTick() {
        return LostTick;
    }

    public void setLostTick(int lostTick) {
        LostTick = lostTick;
    }

    public double getOverall() {
        return overall;
    }

    public void setOverall(double overall) {
        this.overall = overall;
    }

    public Long difference  () throws ParseException {
        strDate = time.StartTime(strDate);
        finDate= time.FinishTime(finDate);
        long diff = finDate.getTime() - strDate.getTime();
        long diffHours = diff / (60*60*1000)%24;
        return diffHours;

    }

    public class Cars {



        public


        PrintWriter outFile = new PrintWriter(new BufferWriter(new FileWriter(Garage.txt)));


    }

    public double price (Long d) throws ParseException {
        double hrs = d.doubleValue();
        long diffhours = difference();
        if (hrs > 3){
            bill = 5.00;

        }
        else 
        {
            if(diffhours <= 10){
                bill = 5.00 + (diffhours * 1.00);
            }
            else {
                bill = 15.00;
            }
        }
        return bill;
    }




}
