package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;

public class Ticket {
    int carID;

    public int getCarsGarage() {
        return carsGarage;
    }
    /*Number of cars in garage */
    public void setCarsGarage(int carsGarage) {
        carsGarage ++;
        this.carsGarage = carsGarage;
    }

    public int getCarsLost() {
        return carsLost;
    }

    //Number of Cars Lost
    public void setCarsLost(int carsLost) {
        carsLost ++;
        this.carsLost = carsLost;
    }

    public Date getStartTime() {
        return startTime;
    }

    //What time they enter the garage
    public void setStartTime(Date startTime) throws ParseException {
        this.startTime = time.StartTime();
    }

    public Date getFinTime() {
        return finTime;
    }

    //What time they leave the garage
    public void setFinTime(Date finTime) throws ParseException {
        this.finTime = time.FinishTime();
    }

    public double getTickCost() {
        return tickCost;
    }

    public void setTickCost(int tickCost) {
        this.tickCost = tickCost;
    }

    public double getEndOfDay() {
        return endOfDay;
    }

    public void setEndOfDay(int endOfDay) {
        this.endOfDay = endOfDay;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    //Lost tickets+ reg tickets
    public void setFinalTotal(double finalTotal) {
        finalTotal = carsLost * 25.00 ;
        this.finalTotal = finalTotal;
    }


    int carsGarage;
    int carsLost;
    Date startTime;
    Date finTime;
    double tickCost;
    double endOfDay;
    double finalTotal;
    Time time = new Time();
    Car car = new Car();




}
