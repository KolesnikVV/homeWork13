package book;

import book.Author;

public class Book {
    String bookName;
    Author authorName;
    int publishingYear;

    public Book(String bookName, int publishingYear,Author authorName) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public Author getAuthorName (){
        return this.authorName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}

