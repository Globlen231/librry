/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20library;

import java.util.Calendar;
import java.util.GregorianCalendar;
import myClasses.Book;
import myClasses.Reader;
import myClasses.Author;
import myClasses.History;



/**
 *
 * @author pupil
 */
class App {
    public void run(){
        Reader reader1=new Reader();
        reader1.setFirstname("Petr");
        reader1.setLastanem("Petrov");
        reader1.setPhone("56973694");
        Reader reader2=new Reader();
        reader2.setFirstname("Deniss");
        reader2.setLastanem("Angeles");
        reader2.setPhone("57893564");
        
        Book book1=new Book();
        book1.setBookname("voina i mir");
        book1.setPublishidyear(2021);
        Author author1=new Author();
        
        author1.setFirstname("Lev");
        author1.setLastname("Tolstoy");
        author1.setBirthyear(1828);
        Author[] authors=new Author[1];
        authors[0]=author1;
        book1.setAuthor(authors);
        
        Book book2=new Book();
        book2.setBookname("otci i deti");
        book2.setPublishidyear(2020);
        Author author2=new Author();
        
        author2.setFirstname("Ivan");
        author2.setLastname("Turgenev");
        author2.setBirthyear(1883);
        Author[] authors2=new Author[2];
        authors[0]=author2;
        book2.setAuthor(authors);
        
        History history1=new History();
        history1.setReader(reader1);
        history1.setBook(book1);
        Calendar c=new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println("history1= "+history1.toString());
        history1.setReturnedDate(c.getTime());
        System.out.println("history1= "+history1.toString());
        
        
        History history2=new History();
        history2.setReader(reader2);
        history2.setBook(book2);
        c=new GregorianCalendar();
        history2.setGivenDate(c.getTime());
        System.out.println("history2= "+history2.toString());
        history2.setReturnedDate(c.getTime());
        System.out.println("history2= "+history2.toString());
        
    }
}