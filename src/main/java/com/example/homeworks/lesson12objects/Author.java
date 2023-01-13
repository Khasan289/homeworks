package com.example.homeworks.lesson12objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName(String name) {

        return this.name;
    }

    public String getSurname(String surname) {
        return this.surname;
    }

    public String getFullNameAuthor() {
        return this.name + " " + surname;

    }


}
