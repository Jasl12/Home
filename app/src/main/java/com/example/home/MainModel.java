package com.example.home;

public class MainModel {
    String name;
    String role;
    Integer rating;
    String location;

    MainModel(){

    }

    public MainModel(String name, String role, Integer rating, String location){

        this.name=name;
        this.role = role;
        this.rating=rating;
        this.location= location;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role= role;
    }

    public Integer getRating(){
        return rating;
    }

    public void setRating(Integer rating){
        this.rating= rating;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location= location;
    }

}

