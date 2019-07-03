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
@Table(name = "category")
@Entity
public class Category extends SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "subject")
    private String Subject;
    @Column(name = "exam_type")
    private String examType;

    @OneToMany(mappedBy = "category")
    List<StudyMaterial> studyMaterials;

    public Category(int id, String type, String Subject, String examType) {
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
