/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import service.types.ExamType;

/**
 *
 * @author DELL
 */
public class CategoryDTO extends SuperDTO{
        private int id;
        private String type;
        private String Subject;
        private ExamType examType;

    public CategoryDTO(int id, String type, String Subject, ExamType examType) {
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

    public ExamType getExamType() {
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

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
        
}
