package com.softwareinstitute.librarySonarExample.odonnell;

public class Main {

    public static void main(String[] args) {

        NonBorrowable book = new NonBorrowable(1980, "Nat Geo", "Nature");
        NonBorrowable book2 = new NonBorrowable(2011, "Ladybird", "Prehistoric");

        book.setCreator("Blue Planet Aquarium");
        book.setTitle("Encyclopedia Galactica");
        System.out.println(book.getTitle());
        System.out.println(book.getScope());
        System.out.println(book.getPublisher());
        System.out.println(book.getPublishedYear());
        System.out.println(book.getCreator());

        book2.setCreator("Attenborough");
        System.out.println(book2.getScope());
        System.out.println(book2.getPublisher());
        System.out.println(book2.getPublishedYear());
        System.out.println(book2.getCreator());

        book.borrow("unable");


    }
}

