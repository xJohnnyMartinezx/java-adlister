package models;

import java.io.Serializable;

public class Author implements Serializable {

    //    ****** PROPERTIES ******
    private Long id;
    private String firstName;
    private String lastName;

//    ******* CONSTRUCTORS ******
//    **** EMPTY *******

    public Author() {
    }

    public Author(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //    ****** GETTERS AND SETTERS **********


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
