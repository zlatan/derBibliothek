package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import javax.persistence.*;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

//    @MapsId
//    @OneToOne
//    @JoinColumn(name="id")

    private int studentClassNumber;
    private int studentEnrollYear;
    private String studentFirstName;
    private String studentLastName;
    private String studentClass;
    private String studentQRCode;

    public int getStudentClassNumber() {
        return studentClassNumber;
    }

    public void setStudentClassNumber(int studentClassNumber) {
        this.studentClassNumber = studentClassNumber;
    }

    public int getStudentEnrollYear() {
        return studentEnrollYear;
    }

    public void setStudentEnrollYear(int studentEnrollYear) {
        this.studentEnrollYear = studentEnrollYear;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentQRCode() {
        return studentQRCode;
    }

    public void setStudentQRCode(String studentQRCode) {
        this.studentQRCode = studentQRCode;
    }
}
