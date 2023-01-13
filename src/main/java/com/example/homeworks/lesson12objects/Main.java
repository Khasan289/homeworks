package com.example.homeworks.lesson12objects;

public class Main {
    public static void printBook(String nameBook, String author, int year) {
        System.out.println(nameBook + " " + author + " " + year);
    }



    public static void main(String[] args) {

        Author sergeiMikhalkov = new Author("Сергей", "Михалков");
        Book threePiglets = new Book("Три поросенка.", sergeiMikhalkov, 2011);
        Author sunTzu = new Author("Сунь","Цзы");
        Book artOfWar = new Book("Искусство войны.", sunTzu, 2023);
        artOfWar.setPublicationYear(1992);
        printBook(artOfWar.getNameBook(), artOfWar.getAuthor().getFullNameAuthor(), artOfWar.getPublicationYear());
        printBook(threePiglets.getNameBook(), threePiglets.getAuthor().getFullNameAuthor(), threePiglets.getPublicationYear());

    }
}
