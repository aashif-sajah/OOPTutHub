package com.aashif.week3;

public class Date{
    public static void main(String args[]){
        // To Test Class Date

        Date date = new Date(1, 1, 2021);
        System.out.println(date.toString());
        Date date2 = new Date(31,28,2000);
        System.out.println(date2.toString());
    }

    private int day;
    private int month;
    private int year;
    private int [] dateArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int day, int month, int year){
        try {
            if (isLeapYear(year)) {
                dateArray[1] = 29; // February has 29 days in a leap year
            }
            if (day < 1 || month < 1 || month > 12 || day > dateArray[month - 1]  || year < 0) {
                throw new IllegalArgumentException("Invalid date");
            }
            this.day = day;
            this.month = month;
            this.year = year;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.day = 24;
            this.month = 10;
            this.year = 2005;
        }
        
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        try {
            if (day < 1 || day > dateArray[month - 1]) {
                throw new IllegalArgumentException("Invalid date");
            }
            this.day = day;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setMonth(int month){
        try {
            if (  month < 1 || month > 12 ||day > dateArray[month - 1]) {
                throw new IllegalArgumentException("Invalid Month");
            }
            this.month = month;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void setYear(int year){
        try {
            if (isLeapYear(year)) {
                dateArray[1] = 29; // February has 29 days in a leap year
            }
            if ( year < 0) {
                throw new IllegalArgumentException("Invalid Year");
            }
            this.year = year;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void setdate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate(){
        return day + "/" + month + "/" + year;
    }

    public String toString(){
        return  "Date [day = "+day+", Month = "+month+", Year = "+year+" ]";
    }

}

