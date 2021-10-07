/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {
    private String bookname;
    private int publishidyear;
    private Author[] author;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPublishidyear() {
        return publishidyear;
    }

    public void setPublishidyear(int publishidyear) {
        this.publishidyear = publishidyear;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public void getPublishidyear(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Book{" + "bookname=" + bookname
                + ", publishidyear=" + publishidyear
                + ", author=" + Arrays.toString(author)
                + '}';
    }
    
    
}
