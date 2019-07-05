/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.dto;

import tk.shareabook.backend.service.types.ExamType;

/**
 *
 * @author DELL
 */
public class CategoryDTO extends SuperDTO{
        private int id;
        private String Subject;
        private ExamType examType;

    public CategoryDTO(int id, String Subject, ExamType examType) {
        this.id = id;
        this.Subject = Subject;
        this.examType = examType;
    }

    public int getId() {
        return id;
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

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
        
}
