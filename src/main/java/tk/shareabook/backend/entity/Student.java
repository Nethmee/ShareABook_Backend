/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author DELL
 */
@Entity
@Table(name = "student")
public class Student extends SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int studentId;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contactNum;
    @Column(name = "email")
    private String email;
    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "primaryKey.student")
    List<StudentUpload> studentUploads;

    @OneToMany(mappedBy = "primaryKey.student")
    List<StudentPurchase> studentPurchases;


    public Student() {
    }

    public Student(int studentId, String city, String contactNum, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.contactNum = contactNum;
        this.email = email;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getContactNum() {
        return contactNum;
    }

    public String getEmail() {
        return email;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<StudentUpload> getStudentUploads() {
        return studentUploads;
    }

    public void setStudentUploads(List<StudentUpload> studentUploads) {
        this.studentUploads = studentUploads;
    }

    public List<StudentPurchase> getStudentPurchases() {
        return studentPurchases;
    }

    public void setStudentPurchases(List<StudentPurchase> studentPurchases) {
        this.studentPurchases = studentPurchases;
    }
}
