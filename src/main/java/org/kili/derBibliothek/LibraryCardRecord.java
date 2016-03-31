package org.kili.derBibliothek;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by zlatan on 29.02.16.
 */
@Entity
public class LibraryCardRecord {

    @Id
    private Integer id;

    private Date beginDate;
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;


    @ManyToOne(fetch = FetchType.LAZY)
    private Book borrowedBooks;

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

    public Book getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
