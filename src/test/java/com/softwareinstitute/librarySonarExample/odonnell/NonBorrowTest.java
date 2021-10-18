package com.softwareinstitute.librarySonarExample.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonBorrowTest {

    @Test
    public void testBookPublisher() {
        NonBorrowable testBook = new NonBorrowable(2001, "Nat Geo", "Greek History");
        assertEquals("The book was not by Nat Geo", "Nat Geo", testBook.getPublisher());
    }

    @Test
    public void testBookYear(){
        NonBorrowable testBook = new NonBorrowable(1998, "Nat Geo", "Greek History");
        assertEquals("The book was not published in 1998 (the best year)", 1998, testBook.getPublishedYear());
    }

    @Test
    public void testBookScope(){
        NonBorrowable testBook = new NonBorrowable(1998, "Nat Geo", "Greek History");
        assertEquals("The book was of the correct scope", "Greek History", testBook.getScope());
    }

    @Test
    public void testTitle() {
        NonBorrowable book = new NonBorrowable(1980, "Nat Geo", "Nature");
        book.setTitle("GoT");
        book.getTitle();
    }
}