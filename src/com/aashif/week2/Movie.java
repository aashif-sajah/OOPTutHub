package com.aashif.week2;

public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAward;

    public Movie(String title, String category, Director director){
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public Director getDirector(){
        return director;
    }

    public void setNumAward(int numAward){
        this.numAward = numAward;
    }

    public int getNumAward(){
        return numAward;
    }

    public String toString(){
        return String.format("Movie [ title = %S, category = %S, director name = %S, director surname = %S, number of awards = %d]",title,category,director.getName(),director.getSureName(),numAward);
    }
}
