package com.aashif.week3;

public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAward;
    private Actor [] actors;
    private int actorCount = 0;

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

    public Actor[] getActors(){
        return actors;
    }

    public void setActor(Actor actor){
        if(actorCount == 0){
            actors = new Actor[1];
            actors[0] = actor;
            actorCount++;
        }else{
            Actor [] temp = new Actor[actorCount + 1];
            for(int i = 0; i < actorCount; i++){
                temp[i] = actors[i];
            }
            temp[actorCount] = actor;
            actors = temp;
            actorCount++;
        }
    }

    @Override
    public String toString() {
        
        for (Actor actor : actors){
            if (actor != null){
                System.out.println(actor.toString());
            }
        }

        // Formatting the entire movie string including the actor list
        return String.format("Movie [ title = %s, category = %s, director name = %s, director surname = %s, number of awards = %d]", 
                         title, category, director.getName(), director.getSureName(), numAward);
}

}
