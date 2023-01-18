package com.example.homeworks.lesson12objects;

import java.util.Objects;

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
        return nameBook + ' ' + author.toString() + ' ' + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }

    public void printBook() {
        System.out.println(toString());
    }

}
