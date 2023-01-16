package com.example.homeworks.lesson12objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publicationYear;

    public Book(String nameBook, Author author, int publicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public String toString() {
        return nameBook + ' ' + author + ' ' + publicationYear;
    }

    public void printBook() {
        System.out.println(toString());
    }

}
