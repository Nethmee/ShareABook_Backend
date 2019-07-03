/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.dto;

/**
 *
 * @author DELL
 */
public class StudentDTO extends SuperDTO{
    
    private int studentId;
    private String name;
    private String contactNum;
    private String profilePicURL;

    public StudentDTO() {
    }

    public StudentDTO(int studentId, String name, String contactNum, String profilePicURL) {
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

    public StudentDTO(int studentId, String name, String contactNum, int creditcardNo, String profilePicURL) {
        this.studentId = studentId;
        this.name = name;
        this.contactNum = contactNum;
        this.profilePicURL = profilePicURL;
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

    public String getContactNum() {
        return contactNum;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    
}
