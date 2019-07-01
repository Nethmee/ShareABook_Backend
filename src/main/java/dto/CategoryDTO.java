/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author DELL
 */
public class CategoryDTO {
        private int id;
        private String type;
        private String Subject;
        private String examType;

    public CategoryDTO(int id, String type, String Subject, String examType) {
        this.id = id;
        this.type = type;
        this.Subject = Subject;
        this.examType = examType;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSubject() {
        return Subject;
    }

    public String getExamType() {
        return examType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }
        
}
