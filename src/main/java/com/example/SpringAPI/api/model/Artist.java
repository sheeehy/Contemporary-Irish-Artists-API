package com.example.SpringAPI.api.model;

import java.util.Date;

public class Artist {

    private int id;
    private String name;
    private int age;
    private String birthDate;
    private String deathDate;
    private String bio;
    private String style;
    private String wikipedia;

    public Artist(int id, String name, int age, String birthDate, String deathDate, String bio, String style, String wikipedia) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.bio = bio;
        this.style = style;
        this.wikipedia = wikipedia;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public String getBio() {
        return bio;
    }

    public String getStyle() {
        return style;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }
}