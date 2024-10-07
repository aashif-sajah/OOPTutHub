package com.aashif.week2;

import com.aashif.week2.*;

public class TestMovie {
    public static void main(String args[]){

        Director director = new Director("Jason","Stathem");
        Date dob = new Date(24,10,2005);
        director.setDob(dob);
        director.setNumberOfMovie(5);
    
        Movie movie = new Movie("Fifty Shades of Boo","Romance",director);
    
        movie.setNumAward(5);
    
        System.out.println(movie); // Movie's toString()
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSureName());
        System.out.println("number of awards is " + movie.getNumAward());
        System.out.println("DOB of director is " + movie.getDirector().getDob());
        System.out.println("Number of movies directed by director is " + movie.getDirector().getNumberOfMovie());
    }
   
}
