package hw13lesson2;

import hw13lesson2.Author;
import hw13lesson2.Book;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author dyma = new Author("Александр", "Дюма");

        Book triMushketera = new Book("Три мушкетёра", 1844, dyma);
        Book triMushketera1 = new Book("Три мушкетёра", 1844, dyma);
        Book evgeniyOnegin = new Book("Евгений Онегин", 1833, pushkin);
        evgeniyOnegin.setPublishingYear(1925);
        System.out.println(triMushketera);
        System.out.println(evgeniyOnegin);
        System.out.println(evgeniyOnegin.hashCode());
        System.out.println(pushkin.hashCode());
        System.out.println(triMushketera.equals(evgeniyOnegin));
        System.out.println(triMushketera.equals(triMushketera1));
    }

}