package com.aashif.week3;

public class Director{
    private String name;
    private String sureName;
    private int numDirectedMovie;
    private Date dob;

    public Director(String name, String sureName){
        this.name = name;
        this.sureName = sureName;
    }

    public String getName(){
        return name;
    }

    public String getSureName(){
        return sureName;
    }

    public void setDob(Date dob){
        this.dob = dob;
    }

    public void setNumberOfMovie(int nMovie){
        this.numDirectedMovie = nMovie;
    }

    public int getNumberOfMovie(){
        return numDirectedMovie;
    }

    public Date getDob(){
        return dob;
    }

    public String toString(){
        return String.format("Director [ name = %S , surename = %S , date = %s , movies directed = %d]",name ,sureName , dob.toString(),numDirectedMovie);
    }

}