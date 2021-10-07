/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

/**
 *
 * @author pupil
 */
public class Author {
    private String firstname;
    private String lastname;
    private int birthyear;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "Author{" + "firstname=" + firstname
                + ", lastname=" + lastname
                + ", birthyear=" + birthyear
                + '}';
    }
    
    
}
