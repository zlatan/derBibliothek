package org.kili.derBibliothek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by zlatan on 31.03.16.
 */
public class BookManagment {

    protected BookRepository brepository;
    protected StudentRepository srepository;
    protected LibraryCardRecordRepository lrepository;
    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public BookManagment(BookRepository brepository, StudentRepository srepository, LibraryCardRecordRepository lrepository) {
        this.brepository = brepository;
        this.srepository = srepository;
        this.lrepository = lrepository;
    }

    protected int BorrowBook(String qrCode, String barCode) {

        Book book = brepository.findByBarCode(barCode);
        Student student = srepository.findByQRCode(qrCode);
        Date now = new Date();

        lrepository.save(new LibraryCardRecord(now, student, book));
        return 0;
    }


    protected int UnBorrowBook(String qrCode, String barCode) {

        Book book = brepository.findByBarCode(barCode);
        Student student = srepository.findByQRCode(qrCode);

        LibraryCardRecord libc = lrepository.findByStudentAndBorrowedBookAndEndDateIsNull(student,book);

        libc.setEndDate(new Date());

        lrepository.save(libc);




        return 0;
    }

}