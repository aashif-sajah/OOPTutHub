package com.aashif.week2;

public class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
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
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
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

