/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Reader reader;
    private Book book;
    private Date givenDate;
    private Date returnedDate;

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    @Override
    public String toString() {
        return "History{"
                + "reader=" + reader
                + ", book=" + book
                + ", givenDate=" + givenDate
                + ", returnedDate=" + returnedDate
                + '}';
    }

    public void setReturnDate(Date time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
