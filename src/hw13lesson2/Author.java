package hw13lesson2;
import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }

    public boolean equals(Object otherAuthor) {
        if (this == otherAuthor) return true;
        if (this.getClass() != otherAuthor.getClass())return false;
        Author thisAuyhor = (Author) otherAuthor;
        return name == thisAuyhor.name && Objects.equals(surname, thisAuyhor.surname);
    }
}
