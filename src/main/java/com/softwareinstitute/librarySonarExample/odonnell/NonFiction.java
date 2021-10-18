package com.softwareinstitute.librarySonarExample.odonnell;

public abstract class NonFiction extends Book {

    //private String referenceBook;
    private String genre;


///////////////////////////////////////////////

    public NonFiction(String type, String genre){
        super(type);
        this.genre = genre;
    }



///////////////////////////////////////////////////


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
