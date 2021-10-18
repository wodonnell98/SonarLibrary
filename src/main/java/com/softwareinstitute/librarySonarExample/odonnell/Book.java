package com.softwareinstitute.librarySonarExample.odonnell;

public abstract class Book {

    private String book;
    private String creator;
    private String title;

/////////////////////////////


    public Book(String type){
        this.book = book;
    }

////////////////////////////////////

    public abstract void borrow(String unable);


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

