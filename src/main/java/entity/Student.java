/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DELL
 */
public class Student {

    private int studentId;
    private String name;
    private int contactNum;
    private String profilePicURL;

    public Student() {
    }

    public Student(int studentId, String name, int contactNum, String profilePicURL) {
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

    public int getContactNum() {
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

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    public Student(int studentId, String name, int contactNum, int creditcardNo, String profilePicURL) {
        this.studentId = studentId;
        this.name = name;
        this.contactNum = contactNum;
        this.profilePicURL = profilePicURL;
    }

}
