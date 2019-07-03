/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.entity;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "student")
public class Student extends SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int studentId;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contactNum;
    @Column(name = "profile_pic")
    private String profilePicURL;

    @OneToMany(mappedBy = "primaryKey.student")
    List<StudentUpload> studentUploads;

    @OneToMany(mappedBy = "primaryKey.student")
    List<StudentPurchase> studentPurchases;


    public Student() {
    }

    public Student(int studentId, String name, String contactNum, String profilePicURL) {
        this.studentId = studentId;
        this.name = name;
        this.contactNum = contactNum;
        this.profilePicURL = profilePicURL;
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

    public String getProfilePicURL() {
        return profilePicURL;
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

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
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
