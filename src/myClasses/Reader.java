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
public class Reader {
   private String firstname;
    private String lastanem;
    private String phone;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastanem() {
        return lastanem;
    }

    public void setLastanem(String lastanem) {
        this.lastanem = lastanem;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" + "firstname=" + firstname
                + ", lastanem=" + lastanem
                + ", phone=" + phone
                + '}';
    }
    
    
}
