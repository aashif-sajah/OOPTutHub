/* 
    In this Class Im Gonna test Both Date class
    and Director Class By Creating a Object for Date Class
    and Director Class and then I will print the Object

         */

package com.aashif.week3;
import com.aashif.week3.*;

public class Test{
    public static void main(String args[]){
        Director director = new Director("Aashif","Sajah");

        // testing getters and Setters

        Date dob = new Date(24,10,2024);
        director.setDob(dob);

        director.setNumberOfMovie(23);

        System.out.println(director); // toString()

        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSureName());
        System.out.println("dob is: " + director.getDob().getDate());
        System.out.println("dob is: " + director.getDob().toString());
        System.out.println("number of directed movies is: " + director.getNumberOfMovie());
    }
}