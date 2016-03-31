package org.kili.derBibliothek;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by zlatan on 29.02.16.
 */

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String volume;

    @Column(nullable = false)
    private Date yearPublishing;

    @Column(nullable = false)
    private Float price;

    @Column(nullable = false)
    private String signature;

    @Column(nullable = false)
    private String deduction;

    @Column(nullable = false, unique = true)
    private String barCode;

    @OneToMany(mappedBy = "borrowedBooks")
    private List<LibraryCardRecord> libraryCardRecord;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Date getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(Date yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDeduction() {
        return deduction;
    }

    public void setDeduction(String deduction) {
        this.deduction = deduction;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public List<LibraryCardRecord> getLibraryCardRecord() {
        return libraryCardRecord;
    }

    public void setLibraryCardRecord(List<LibraryCardRecord> libraryCardRecord) {
        this.libraryCardRecord = libraryCardRecord;
    }
}
