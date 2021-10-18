package com.softwareinstitute.librarySonarExample.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonFictionTest {

    @Test
    public void testGenre(){
        NonBorrowable testType = new NonBorrowable(2001, "nat geo", "nature");
        assertEquals("reference book", "reference book");
    }
}
