package org.kili.derBibliothek;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by zlatan on 29.02.16.
 */

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String bookTitle;
    private String bookAuthor;
    private String bookBarCode;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookBarCode() {
        return bookBarCode;
    }

    public void setBookBarCode(String bookBarCode) {
        this.bookBarCode = bookBarCode;
    }

}
