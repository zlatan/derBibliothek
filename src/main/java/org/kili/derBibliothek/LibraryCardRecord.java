package org.kili.derBibliothek;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zlatan on 29.02.16.
 */
@Entity
public class LibraryCardRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Date beginDate;
    private Date endDate;

    private LibraryCardRecord() {}


    public LibraryCardRecord(Date beginDate, Student student, Book borrowedBook) {
        this.beginDate = beginDate;
        this.student = student;
        this.borrowedBook = borrowedBook;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book borrowedBook;

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, beginDate='%s', endDate='%s' ]",
                id, beginDate, endDate );
    }

}
