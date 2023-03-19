package hw13lesson2;

import java.util.Objects;
public class Book {
   private String bookName;
    private Author authorName;
    private int publishingYear;

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
    public String toString() {
        return "название " + this.bookName + " автор " + this.authorName + " год публикации " + this.publishingYear;
    }
    public int hashCode() {
        return java.util.Objects.hash(bookName, publishingYear, authorName);
    }
    public boolean equals(Object other) {
        if(this == other) return true;
        if (this.getClass() != other.getClass())return false;
        Book thisBook = (Book) other;
        return publishingYear == thisBook.publishingYear && Objects.equals(bookName, thisBook.bookName) && Objects.equals(authorName, thisBook.authorName);
    }

}

