package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import javax.persistence.*;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

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

//    @OneToOne()
//    @PrimaryKeyJoinColumn
    @Transient
    private StudentCard libraryCard;

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

    public String getQRCode() {
        return qRCode;
    }

    public void setQRCode(String qrCode) {
        this.qRCode = qrCode;
    }

    public StudentCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(StudentCard libraryCard) {
        this.libraryCard = libraryCard;
    }
}
