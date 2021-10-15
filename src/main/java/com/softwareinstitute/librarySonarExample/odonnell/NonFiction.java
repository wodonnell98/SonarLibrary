package com.softwareinstitute.librarySonarExample.odonnell;

public abstract class NonFiction extends Book {

    private String referenceBook;


///////////////////////////////////////////////

    public NonFiction(String type, String genre){
        super(type);
        genre = referenceBook;
    }



///////////////////////////////////////////////////

    public String getReferenceBook() {
        return referenceBook;
    }

    public void setReferenceBook(String referenceBook) {
        this.referenceBook = referenceBook;
    }
}
