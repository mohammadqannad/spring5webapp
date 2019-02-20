package guru.springframework.spring5webapp.model;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {


    private String firstName;
    private String lastName;

    private Set<Book> books = new HashSet<>();

    public Author(){

    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName, set<bool> books){
        this.firstName= firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBooks(set<Book> books) {
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public set<Book> getBooks() {
        return books;
    }
}
