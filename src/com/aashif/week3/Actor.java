package com.aashif.week3;

public class Actor {
    private String name;
    private int age;
    private String gender;

    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public Actor() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString() {
        return String.format("Actor [ name = %S, age = %d, gender = %S ]",name,age,gender);
    }
}
