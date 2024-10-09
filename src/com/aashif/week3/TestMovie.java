package com.aashif.week3;

import com.aashif.week3.*;

public class TestMovie {
    public static void main(String args[]){

        Director director = new Director("Jason","Stathem");
        Date dob = new Date(24,10,2005);
        director.setDob(dob);
        director.setNumberOfMovie(5);
        Actor actor1 = new Actor("Jhon boy",18,"Male");
        Actor actor2 = new Actor("Kie",18,"Female");
        Actor actor3 = new Actor("Pope",18,"Male");
        Actor actor4 = new Actor("sarah",18,"Female");

        


    
        Movie movie = new Movie("Fifty Shades of Boo","Romance",director);



        movie.setActor(actor1);
        movie.setActor(actor2);
        movie.setActor(actor3);
        movie.setActor(actor4);

        // Get actors using getActor() method
        Actor[] actorArray = movie.getActors();

        // Print each actor's details using a loop
        System.out.print("Actors in the movie are:");
        for (Actor actor : actorArray) {
            if (actor != null) {  // Ensure the actor is not null before printing
                System.out.println(actor.toString());
            }
        }
        
    
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
