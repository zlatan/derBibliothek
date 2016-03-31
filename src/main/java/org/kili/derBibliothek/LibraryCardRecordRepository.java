package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface LibraryCardRecordRepository extends CrudRepository<LibraryCardRecord, Long> {

    LibraryCardRecord findByStudent(@Param("student") Student student);
    LibraryCardRecord findByBorrowedBook(@Param("borrowedBook") Book borrowedBook);
    LibraryCardRecord findByStudentAndBorrowedBook(Student student, Book borrowedBook); // AND
    LibraryCardRecord findByStudentAndBorrowedBookAndEndDateIsNull(Student student, Book borrowedBook);


}
