package book;

import book.Author;
import book.Book;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author dyma = new Author("Александр", "Дюма");

        Book triMushketera = new Book("Три мушкетёра", 1844, dyma);
        Book evgeniyOnegin = new Book("Евгений Онегин", 1833, pushkin);
        evgeniyOnegin.setPublishingYear(1925);
    }
}