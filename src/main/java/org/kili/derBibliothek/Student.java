package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import javax.persistence.*;
import java.util.List;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer classNumber;

    @Column(nullable = false)
    private Integer enrollYear;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(name="class")
    private String clazz;

    @Column(name="qr_code", nullable = false, unique = true)
    private String qRCode;

    protected Student() {}

    public Student(Integer classNumber, Integer enrollYear, String firstName, String lastName, String clazz, String qRCode) {
        this.classNumber = classNumber;
        this.enrollYear = enrollYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clazz = clazz;
        this.qRCode = qRCode;
    }


    //@OneToMany
    //@JoinTable(name = "STUDENT_LIBCARD", joinColumns = @JoinColumn(name = "STUDENT_ID"), inverseJoinColumns = @JoinColumn(name = "LIBCARD_ID"))
    //Alternative Variant for One to Many Relation
    @OneToMany(mappedBy = "student")
    private List<LibraryCardRecord> libraryCardRecord;

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getEnrollYear() {
        return enrollYear;
    }

    public void setEnrollYear(Integer enrollYear) {
        this.enrollYear = enrollYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getqRCode() {
        return qRCode;
    }

    public void setqRCode(String qRCode) {
        this.qRCode = qRCode;
    }

    public List<LibraryCardRecord> getLibraryCardRecord() {
        return libraryCardRecord;
    }

    public void setLibraryCardRecord(List<LibraryCardRecord> libraryCardRecord) {
        this.libraryCardRecord = libraryCardRecord;
    }


}
