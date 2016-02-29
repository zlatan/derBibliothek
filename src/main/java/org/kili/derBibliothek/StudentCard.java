package org.kili.derBibliothek;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zlatan on 29.02.16.
 */
@Entity
public class StudentCard {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


//    @OneToOne
//    @PrimaryKeyJoinColumn
    private long book_id;
    private Date beginDate;
    private Date endDate;

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

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
}
